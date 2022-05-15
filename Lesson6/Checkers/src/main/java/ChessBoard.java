import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;


public class ChessBoard extends JComponent {
    public static final int SIZE = 8;
    public static final int FILED_EMPTY = 0;
    boolean WhoSturn;
    ChessCell[][] field;

    public ChessBoard() {
        enableEvents(AWTEvent.MOUSE_EVENT_MASK);
        this.field = new ChessCell[8][8];
        initGame();
        InCellChecker();
    }

    public void initGame() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = new ChessCell();
            }
        }
        WhoSturn = true;
    }

    public void InCellChecker() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (i % 2 == 0 && j % 2 != 0) {
                    field[i][j].check = new Check();
                    field[i][j].check.color = 1;
                } else if (i % 2 != 0 && j % 2 == 0) {
                    field[i][j].check = new Check();
                    field[i][j].check.color = 1;
                }
            }
        }
        for (int i = SIZE - 1; i > 4; i--) {
            for (int j = 0; j < SIZE; j++) {
                if (i % 2 == 0 && j % 2 != 0) {
                    field[i][j].check = new Check();
                    field[i][j].check.color = 2;
                } else if (i % 2 != 0 && j % 2 == 0) {
                    field[i][j].check = new Check();
                    field[i][j].check.color = 2;
                }
            }
        }
    }

    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.clearRect(0, 0, getWidth(), getHeight());
        drawGrid(graphics);
        drawCheck(graphics);
        drawMark(graphics);
//        repaint();//нельзя тут repaint! т.к он постоянно будет перерисовывать циклично.
    }

    void drawWhiteCheck(int i, int j, Graphics graphics) {
        graphics.setColor(Color.WHITE);
        int dw = 720 / SIZE;
        int dh = 720 / SIZE;
        int x = j * dw;
        int y = i * dh;
        graphics.fillOval(x + 5, y + 5, 80, 80);
    }

    void drawBlackCheck(int i, int j, Graphics graphics) {
        graphics.setColor(Color.BLACK);
        int dw = 720 / SIZE;
        int dh = 720 / SIZE;
        int x = j * dw;
        int y = i * dh;
        graphics.fillOval(x + 5, y + 5, 80, 80);
    }

    void drawCheck(Graphics graphics) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j].check != null) {
                    if (field[i][j].check.color == 1) {
                        drawBlackCheck(i, j, graphics);
                    } else if (field[i][j].check.color == 2) {
                        drawWhiteCheck(i, j, graphics);
                    }
                }
            }
        }
    }

    void delMark1(int markedI, int markedJ) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (i != markedI || j != markedJ && field[i][j].IsMarked) {
                    field[i][j].IsMarked = false;
                }
            }
        }
    }

    void delMark() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (field[i][j].IsMarked) {
                    field[i][j].IsMarked = false;
                }
            }
        }
    }

    void drawMark(Graphics graphics) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (field[i][j].IsMarked) {
                    drawSquareYellow(graphics, i * 90, j * 90);
                }
            }
        }
    }


    public void processMouseEvent(MouseEvent mouseEvent) {
        super.processMouseEvent(mouseEvent);
        if (mouseEvent.getButton() == MouseEvent.BUTTON1) {
            if (numberOfMark() == 0) {
                int x = mouseEvent.getY();
                int y = mouseEvent.getX();
                int i = (int) ((float) x / 720 * SIZE);
                int j = (int) ((float) y / 720 * SIZE);
                if (field[i][j].check != null) {
                    mark(i, j);
                }
            }
            int x = mouseEvent.getY();
            int y = mouseEvent.getX();
            int i = (int) ((float) x / 720 * SIZE);
            int j = (int) ((float) y / 720 * SIZE);
            if (!field[i][j].IsMarked) {
                if (numberOfMark() == 1) {
                    delChecker();
                    createChecker(i, j);
                    delMark();
                }
            }
        }
        if (mouseEvent.getButton() == MouseEvent.BUTTON3) {
            delMark();
        }
        repaint();
    }

    void delChecker() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (field[i][j].IsMarked && field[i][j].check != null) {
                    field[i][j].check = null;
                }
            }
        }
    }

    void createChecker(int i, int j) {

        if (!field[i][j].IsMarked && field[i][j].check == null) {
            field[i][j].check = new Check();
            field[i][j].check.color = 1;
        }
    }

    int numberOfMark() {
        int temp = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (field[i][j].IsMarked) {
                    temp++;
                }
            }
        }
        return temp;
    }

    void mark(int i, int j) {
        field[i][j].IsMarked = true;
    }


    void drawSquareYellow(Graphics graphics, int i, int j) {
        Graphics2D graphics2D = (Graphics2D) graphics;
        graphics2D.setStroke(new BasicStroke(3));
        graphics2D.setColor(Color.YELLOW);
        Shape rect = new Rectangle(j, i, 90, 90);
        graphics2D.draw(rect);
    }


    void drawGrid(Graphics graphics) {
        int w = 720;
        int h = 720;
        int dw = w / SIZE;
        int dh = h / SIZE;
        graphics.setColor(Color.GRAY);
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (i % 2 == 0 && j % 2 != 0) {
                    graphics.fillRect((i * dw), (j * dh), 90, 90);
                } else if (i % 2 != 0 && j % 2 == 0) {
                    graphics.fillRect((i * dw), (j * dh), 90, 90);
                }
            }
        }
    }
}

