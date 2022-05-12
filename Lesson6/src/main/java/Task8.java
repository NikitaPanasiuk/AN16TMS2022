/*
 * 1) Создать класс User для хранения о обработки данных о пользователе.
 * Создать поля для хранения имени и фамилии, возраста и пола. Создать методы для:
 *  - Возврата имени и фамилии полностью
 *  - Увеличения возраста
 *  - Вывода общей информации о пользователе
 *  В Main классе в методе main создайте экземпляр класса User и вызовите все созданные методы, передав им необходимые параметры.
 * 2) Создать в классе User несколько конструкторов. Создать объект этого класса, использовав один из них.
 * В этом конструкторе сделать вызов другого конструктора этого же класса.
 * Отметьте один из методов как @Deprecated. Попробуйте на экземпляре класса вызвать этот метод.
 */

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        User user1 = new User("Misha", "Petrov", "male", 23);
        user1.firstName = "Mikola";
        user1.secondName = "Kovalev";
        user1.age = 14;
        user1.gender = "male";
        user1.agePlus(n);
        user1.getFirstNameAndSecondName();
        user1.getInf();
        User user2 = new User("maik", "pavlov", "male");
        user2.getFirstNameAndSecondName();
        user2.getInf();
        User user3 = new User("Antonio");
        user3.getInf();
        System.out.println(user1.getFirstNameAndSecondName());
    }

}

class User {
    String firstName;
    String secondName;
    String gender;
    int age;

    User(String name) {
        this(name, name, name, 4);
    }

    User(String firstName, String secondName, String gender) {
        this.secondName = secondName;
        this.firstName = firstName;
        this.gender = gender;
    }

    User(String firstName, String secondName, String gender, int age) {
        this(firstName, secondName, gender);
        this.age = age;
    }

    public void getInf() {
        System.out.println("the first name is " + firstName);
        System.out.println("the second name is " + secondName);
        System.out.println("gender is " + gender);
        System.out.println("age is " + age);
    }

    @Deprecated
    public int agePlus(int temp) {
        age += temp;
        return age;
    }

    public String getFirstNameAndSecondName() {
        return firstName + secondName;
    }
}
