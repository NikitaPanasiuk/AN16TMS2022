public class Task4v1 {
    public static void main(String... args) {
        int n = (int) (Math.random() * 28800);
        double x = (double) n / 3600;
        if (n > 1) {
            System.out.println(n + " seconds left until the end of the day");
        } else {
            System.out.println(n + " second left until the end of the day");
        }
        if ((Math.floor(x)) > 1) {
            System.out.println(Math.floor(x) + " hours left until the end of the day");
        } else {
            System.out.println(Math.floor(x) + " hour left until the end of the day");
        }
    }
}

