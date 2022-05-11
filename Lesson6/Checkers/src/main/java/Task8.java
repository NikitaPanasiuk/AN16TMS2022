import javax.swing.*;
import java.awt.*;

//написать игру шашки
public class Task8 {
    public static void main(String[] args) {
        JFrame window = new JFrame("Checkers");//создаем окно
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//добавляем кнопку закрытия
        window.setSize(732, 755);//устанавливаем размер
        window.setLayout(new BorderLayout());//менеджмент компановки элементов
        window.setLocationRelativeTo(null);//чтобы окно было по центру экрана
        ChessBoard game = new ChessBoard();
        window.add(game);
        window.setVisible(true);//включаем видимость окна
    }
}
