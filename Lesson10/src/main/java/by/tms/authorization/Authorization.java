package by.tms.authorization;

import java.util.Objects;
import java.util.Scanner;

public class Authorization {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input login, pass and confirm pass");
        try {
            System.out.println(checkAuthorization(in.next(), in.next(), in.next()));
        } catch (WrongPass e) {
            System.out.println("Wrong pass");
        } catch (WrongLogin e) {
            System.out.println("Wrong login");
        }

    }

    private static boolean checkAuthorization(String login, String password, String confPass) throws WrongLogin, WrongPass {
        if (login.length() < 20) {
            if (password.length() < 20) {
                if (!Objects.equals(confPass, password)) {
                    return true;
                } else {
                    throw new WrongPass("Wrong confirm pass!");
                }
            } else {
                throw new WrongPass("wrong pass!");
            }
        } else {
            throw new WrongLogin("wrong login!");
        }
    }
}
