import java.util.Scanner;

//    3)В доме Вилли установили скоростной лифт новой экспериментальной модели.
//    В этом лифте кнопки с номерами этажей заменены двумя другими кнопками.
//    При нажатии на первую кнопку лифт поднимается на один этаж вверх, а при нажатии на вторую – опускается на один этаж вниз.
//    Младшему брату Вилли Дилли очень нравится кататься на новом лифте.
//    Он катается на нём до тех пор, пока не побывает на каждом из этажей хотя бы по одному разу.
//    После этого Дилли довольный возвращается домой.
//    Зная порядок, в котором Дилли нажимал на кнопки лифта, попробуйте определить общее количество этажей в доме Вилли и Дилли.
//    На вход приходит последовательность нажатий на кнопки лифта.
//    Символ «1» означает, что была нажата первая кнопка, а символ «2» – что была нажата вторая кнопка.
//    Символы «1» и «2» не разделены пробелами. Количество нажатий от 1 до 100.
//    Гарантируется, что лифт никогда не опускался ниже первого и не поднимался выше последнего этажа.
//    Следует вывести одно число – количество этажей в доме Вилли и Дилли.
public class Task3 {
    public static void main(String[] args) {
        String move;
        Scanner in = new Scanner(System.in);
        System.out.println("input button press order");
        move = in.next();
        int av = 0;
        int min = 0;
        int max = 0;
        for (int i = 0; i < move.length(); i++) {
            if (move.charAt(i) == '1') {
                av = av + 1;
            } else {
                av = av - 1;
            }
            if (av > max) {
                max = av;
            }
            if (av < min) {
                min = av;
            }

        }
        System.out.println(Math.abs(max) + Math.abs(min) + 1);
    }
}