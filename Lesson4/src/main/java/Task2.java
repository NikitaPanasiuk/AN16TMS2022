//Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
//         сколько амеб будет через 3, 6, 9, 12,..., 24 часа
public class Task2 {
    public static void main(String[] args) {
        int nE = 1, k = 2;
        for (int i = 3; i <= 24; i = i + 3) {
            nE = nE * k;
            System.out.println("After " + i + " hours number of amoebas will be " + nE);
        }
    }

}
