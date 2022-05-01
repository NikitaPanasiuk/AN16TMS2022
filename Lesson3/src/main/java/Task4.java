public class Task4 {
    public static void main(String[] args) {
        int n=((int)(Math.random()*28801));
        int x= (int) Math.floor((double)n/60);
        System.out.println("Док конца рабочего дня осталось "+n+" секунд");
        System.out.println("Док конца рабочего дня осталось "+x+" часов");
    }
}
