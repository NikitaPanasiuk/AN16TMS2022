import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class TicTacToe extends JComponent {
    public static final int FILED_EMPTY = 0;
    public static final int FILED_X = 10;
    public static final int FILED_0 = 200;
    int[][] field;
    boolean isXturn;

    void drawGrid(Graphics graphics) {
        int w = getWidth();
        int h = getHeight();
        int dw = w / 3;
        int dh = h / 3;
        getGraphics().setColor(Color.BLACK);
        for (int i = 1; i < 3; i++) {
            graphics.drawLine(0, dh * i, w, dh * i);
            graphics.drawLine(dw * i, 0, dw * i, h);
        }
    }

    void drawX(int i, int j, Graphics graphics) {
        graphics.setColor(Color.RED);
        int dw = getWidth() / 3;
        int dh = getHeight() / 3;
        int x = i * dw;
        int y = j * dh;
        graphics.drawLine(x, y, x + dw, y + dh);
        graphics.drawLine(x, y + dh, x + dw, y);
    }

    void draw0(int i, int j, Graphics graphics) {
        graphics.setColor(Color.RED);
        int dw = getWidth() / 3;
        int dh = getHeight() / 3;
        int x = i * dw;
        int y = j * dh;
        graphics.drawOval(x + 5 * dw * dw / 100, y, dw * 9 / 10, dh);
    }

    void drawX0(Graphics graphics) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == FILED_X) {
                    drawX(i, j, graphics);
                } else if (field[i][j] == FILED_0) {
                    draw0(i, j, graphics);
                }
            }
        }
    }

    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.clearRect(0, 0, getWidth(), getHeight());
        drawGrid(graphics);
        drawX0(graphics);
    }

    public TicTacToe() {
        enableEvents(AWTEvent.MOUSE_EVENT_MASK);
        field = new int[3][3];
        initGame();
    }

    public void initGame() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = FILED_EMPTY;
            }
            System.out.println();
        }
        isXturn = true;
    }


    public void processMouseEvent(MouseEvent mouseEvent) {
        super.processMouseEvent(mouseEvent);
        if (mouseEvent.getButton() == MouseEvent.BUTTON1) {
            int x = mouseEvent.getX();
            int y = mouseEvent.getY();
            int i = (int) ((float) x / getWidth() * 3);
            int j = (int) ((float) y / getHeight() * 3);
            if (field[i][j] == FILED_EMPTY) {
                field[i][j] = isXturn ? FILED_X : FILED_0;
                isXturn = !isXturn;
                repaint();
                int res = checkState();
                if (res != 0) {
                    if (res == FILED_0 * 3) {
                        JOptionPane.showMessageDialog(this, "Zeroes win!", "Winner, Winner Chicken Diner!", JOptionPane.INFORMATION_MESSAGE);
                    } else if (res == FILED_X * 3) {
                        JOptionPane.showMessageDialog(this, "Crosses win!", "Winner, Winner Chicken Diner!", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(this, "No winner", "No Diner", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        }
        initGame();
        repaint();
    }


    int checkState() {
        int diag1 = 0;
        int diag2 = 0;
        for (int i = 0; i < field.length; i++) {
            diag1 += field[i][i];
            diag2 += field[i][2 - i];
        }
        if (diag1 == FILED_0 * 3 || diag1 == FILED_X * 3) {
            return diag1;
        }
        if (diag2 == FILED_0 * 3 || diag2 == FILED_X * 3) {
            return diag2;
        }
        int chek_i, chek_j;
        boolean hasEmpty = false;
        for (int i = 0; i < field.length; i++) {
            chek_i = 0;
            chek_j = 0;
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == FILED_EMPTY) {
                    hasEmpty = true;
                } else {
                    chek_i += field[i][i];
                    chek_j += field[j][i];
                }
            }
            if (chek_i == FILED_0 * 3 || chek_i == FILED_X * 3) {
                return chek_i;
            }
            if (chek_j == FILED_0 * 3 || chek_j == FILED_X * 3) {
                return chek_j;
            }
        }
        if (hasEmpty) {
            return 0;
        } else {
            return -1;
        }
    }


}

