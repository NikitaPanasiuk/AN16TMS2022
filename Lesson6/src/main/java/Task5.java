import java.io.IOException;

//    1) Для данной буквы английского алфавита нужно вывести справа стоящую букву на стандартной клавиатуре.
//    При этом клавиатура замкнута, т.е.
//    справа от буквы «p» стоит буква «a», от буквы «l» стоит буква «z», а от буквы «m» — буква «q».
//    Для решения задачи нужно использовать массив символов!
public class Task5 {
    public static void main(String[] args) throws IOException {
        char[] mass = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm'};
        char simb = (char) System.in.read();
        for (int i = 0; i < mass.length - 1; i++) {
            if (simb == mass[i]) {
                System.out.println(mass[i + 1]);
                break;
            } else if (simb == 'm') {
                System.out.println("q");
                break;
            }
        }
    }
}
