import java.util.ArrayList;

//7) Проверить, различны ли все элементы массива, если не различны то вывести элемент повторяющийся
//        Пример: {0,3,46,3,2,1,2}
//        Массив имеет повторяющиеся элементы 3, 2
//        Пример: {0,34,46,31,20,1,28}
//        Массив не имеет повторяющихся элементов
public class Task7 {
    public static void main(String[] args) {
        int[] mass = new int[20];
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            mass[i] = (int) (Math.random() * 10);
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 20; i++) {
            if (!list1.contains(mass[i])) {
                list1.add(mass[i]);
                continue;
            }
            if (!list2.contains(mass[i])) {
                list2.add(mass[i]);
            }
        }
        for (int item : list2) {
            System.out.print(item + " ");
        }
    }
}






