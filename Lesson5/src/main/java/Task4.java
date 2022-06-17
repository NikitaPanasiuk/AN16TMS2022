//4) Создайте массив из int[] mass = new int[12]; Рандомно заполните его значениями от 0 до 15.
//Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
//Пример: {3,4,5,62,7,8,4,-5,7,62,5,1} Максимальный элемент 62, индекс его последнего вхождения в массив = 10

public class Task4 {
    public static void main(String[] args) {
        int[] mass = new int[12];
        int z = 0;
        int p = 0;
        for (int i = 0; i < 12; i++) {
            mass[i] = (int) (Math.random() * 16);
            System.out.print(mass[i] + " ");
            if (mass[i] >= z) {
                z = mass[i];
                p = i;
            }
        }
        System.out.println();
        System.out.println("index " + (p + 1) + " element " + z);
    }
}

