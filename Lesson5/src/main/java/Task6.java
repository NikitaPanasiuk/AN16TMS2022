//6) Найти максимальный элемент в массиве {4,5,0,23,77,0,8,9,101,2} и поменять его местами с нулевым элементом
public class Task6 {
    public static void main(String[] args) {
        int[] mass = {4, 5, 0, 23, 77, 0, 8, 9, 101, 2};
        int max = 0;
        int sh = mass[0];
        int p = 0;
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
            if (mass[i] > max) {
                max = mass[i];
                p = i;
            }
        }
        mass[p] = sh;
        mass[0] = max;
        System.out.println();
        for (int j : mass) {
            System.out.print(j + " ");
        }
    }

}

