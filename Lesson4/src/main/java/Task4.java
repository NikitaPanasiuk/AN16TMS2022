import java.util.Scanner;

//4) Дано 2 числа, день и месяц рождения. Написать программу, которая определяет знак зодиака человека.
public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        do {
            System.out.println("To end program input 0, to continue input another whole number");
            x = in.nextInt();
            System.out.println("Input a birth day");
            if (in.hasNextInt()) {
                int d = in.nextInt();
                System.out.println("Input a birth month");
                if (in.hasNextInt()) {
                    int m = in.nextInt();
                    if (m > 12) {
                        System.out.println("You input wrong date!");
                    } else {
                        if (m == 2 && d > 28) {
                            System.out.println("You input wrong date!");
                        } else {
                            if (d > 31) {
                                System.out.println("You input wrong date!");
                            } else {
                                switch (m) {
                                    case 1:
                                        if (d >= 1 && d <= 20) {
                                            System.out.println("your zodiac sign is Capricorn");
                                        } else {
                                            System.out.println("your zodiac sign is Aquarius");
                                        }
                                        break;
                                    case 2:
                                        if (d >= 1 && d <= 19) {
                                            System.out.println("your zodiac sign is Aquarius ");
                                        } else {
                                            System.out.println("your zodiac sign is Pisces ");
                                        }
                                        break;
                                    case 3:
                                        if (d >= 1 && d <= 20) {
                                            System.out.println("your zodiac sign is Pisces ");
                                        } else {
                                            System.out.println("your zodiac sign is Aries ");
                                        }
                                        break;
                                    case 4:
                                        if (d >= 1 && d <= 20) {
                                            System.out.println("your zodiac sign is Aries");
                                        } else {
                                            System.out.println("your zodiac sign is Taurus");
                                        }
                                        break;
                                    case 5:
                                        if (d >= 1 && d <= 21) {
                                            System.out.println("your zodiac sign is Taurus");
                                        } else {
                                            System.out.println("your zodiac sign is Gemini");
                                        }
                                        break;
                                    case 6:
                                        if (d >= 1 && d <= 21) {
                                            System.out.println("your zodiac sign is Gemini");
                                        } else {
                                            System.out.println("your zodiac sign is Cancer");
                                        }
                                        break;
                                    case 7:
                                        if (d >= 1 && d <= 22) {
                                            System.out.println("your zodiac sign is Cancer");
                                        } else {
                                            System.out.println("your zodiac sign is a Leo");
                                        }
                                        break;
                                    case 8:
                                        if (d >= 1 && d <= 21) {
                                            System.out.println("your zodiac sign is Leo");
                                        } else {
                                            System.out.println("your zodiac sign is a Virgo");
                                        }
                                        break;
                                    case 9:
                                        if (d >= 1 && d <= 23) {
                                            System.out.println("your zodiac sign is Virgo");
                                        } else {
                                            System.out.println("your zodiac sign is Libra");
                                        }
                                        break;
                                    case 10:
                                        if (d >= 1 && d <= 23) {
                                            System.out.println("your zodiac sign is Libra");
                                        } else {
                                            System.out.println("your zodiac sign is Scorpio");
                                        }
                                        break;
                                    case 11:
                                        if (d >= 1 && d <= 23) {
                                            System.out.println("your zodiac sign is Scorpio");
                                        } else {
                                            System.out.println("your zodiac sign is Sagittarius");
                                        }
                                        break;
                                    case 12:
                                        if (d >= 1 && d <= 23) {
                                            System.out.println("your zodiac sign is Sagittarius");
                                        } else {
                                            System.out.println("your zodiac sign is Capricorn");
                                        }
                                        break;
                                }
                            }
                        }
                    }
                }else {
                    System.out.println("You input non-whole number or symbol, try again");
                    in.next();
                }

            } else {
                System.out.println("You input non-whole number or symbol, try again");
                in.next();
            }
        } while (x != 0);
    }
}

