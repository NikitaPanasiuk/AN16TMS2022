import javax.swing.*;
import java.awt.*;

//    2)Крестики-нолики
//    Разработать консольную игру крестики-нолики. В игре участвуют 2 игрока.
//    Они по очереди вводят координаты клетки в которую хотят сделать ход.
//    После каждого хода, в консоли отрисовывается игровое поле с текущим состоянием.
//    Игра продолжается до победы одного из игроков или ничьи.
public class Task7 {
    public static void main(String[] args) {
        System.out.println("Start game...");
        JFrame window = new JFrame("TicTacToe");//создаем окно
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//добавляем кнопку закрытия
        window.setSize(400, 400);//устанавливаем размер
        window.setLayout(new BorderLayout());//менеджмент компановки элементов
        window.setLocationRelativeTo(null);//чтобы окно было по центру экрана
        window.setVisible(true);//включаем видимость окна
        TicTacToe game = new TicTacToe();
        window.add(game);
        System.out.println("Game over");

    }
}

