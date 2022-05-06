import java.util.Scanner;

public class Task7_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] mass = new int[n];
        int temp;
        for (int i = 0; i < n; i++) {
            mass[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int min = mass[i];
            int min_i = i;
            for (int j = i + 1; j < n; j++) {
                if (mass[j] < min) {
                    min = mass[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                temp = mass[i];
                mass[i] = mass[min_i];
                mass[min_i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        boolean z = true;
        for (int i = 0; i < mass.length - 1; i++) {
            if (mass[i] == mass[i + 1] && z) {
                System.out.print(mass[i] + " ");
                z = false;
            } else {
                if (mass[i] != mass[i + 1]) {
                    z = true;
                }
            }
        }
    }
}
