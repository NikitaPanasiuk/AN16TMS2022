import javax.swing.*;

//1 - черная шашка
//2 - белая шашка
//0 - пустая клетка

public class ChessCell extends JComponent {

    public int Checker;
    public boolean IsQueen;
    public boolean IsMarked = false;

    public boolean isMarked() {
        return IsMarked;
    }

    public void сhangeChecker(int color) {
        this.Checker = color;
    }
}

