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
        InCellCheker();
    }

    public void initGame() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                field[i][j] = new ChessCell();
            }
        }
        WhoSturn = true;
    }

    public void InCellCheker() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0 && j % 2 != 0) {
                    field[i][j].сhangeChecker(1);
                } else if (i % 2 != 0 && j % 2 == 0) {
                    field[i][j].сhangeChecker(1);
                }
            }
        }
        for (int i = 7; i > 4; i--) {
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0 && j % 2 != 0) {
                    field[i][j].сhangeChecker(2);
                } else if (i % 2 != 0 && j % 2 == 0) {
                    field[i][j].сhangeChecker(2);
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
        delMark();
        repaint();
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
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j].Checker == 1) {
                    drawBlackCheck(i, j, graphics);
                }
            }
        }
        for (int i = 7; i > 4; i--) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j].Checker == 2) {
                    drawWhiteCheck(i, j, graphics);
                }
            }
        }
    }

    void delMark() {
        int Marked = 0;
        int temp_i = 0;
        int temp_j = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (field[i][j].IsMarked) {
                    if (Marked == 0) {
                        temp_i = i;
                        temp_j = j;
                        Marked++;
                    } else {
                        Marked--;
                        field[temp_i][temp_j].IsMarked = false;
                    }
                }
            }
        }
    }

    void drawMark(Graphics graphics) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (field[i][j].IsMarked) {
                    drawSquare(graphics, i * 90, j * 90);
                }
            }
        }
    }


    public void processMouseEvent(MouseEvent mouseEvent) {
        super.processMouseEvent(mouseEvent);
        if (mouseEvent.getButton() == MouseEvent.BUTTON1) {
            int x = mouseEvent.getX();
            int y = mouseEvent.getY();
            int i = (int) ((float) x / 720 * SIZE);
            int j = (int) ((float) y / 720 * SIZE);
            field[i][j].IsMarked = true;

        }
    }


    void drawSquare(Graphics graphics, int i, int j) {
        Graphics2D graphics2D = (Graphics2D) graphics;
        graphics2D.setStroke(new BasicStroke(3));
        graphics2D.setColor(Color.YELLOW);
        Shape rect = new Rectangle(i, j, 90, 90);
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

