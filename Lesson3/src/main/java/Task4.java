public class Task4 {
    //задача на вывод целого количество часов из рандомного числа
    public static void main(String[] args) {
        int n = ((int) (Math.random() * 28801));
        int x = (int) Math.floor((double) n / 3600);
        if (n > 1) {
            System.out.println(n + " seconds left until the end of the working day");
        } else {
            System.out.println(n + " second left until the end of the working day");
        }
        if (x > 1) {
            System.out.println(x + " hours left until the end of the working day");
        } else {
            System.out.println(x + " hour left until the end of the working day");
        }
    }
}
