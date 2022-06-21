package by.tms.model;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Computer {
    String cpu;
    String ram;
    String hdd;
    int cycleResource = 4;
    public boolean isBurned = false;

    public Computer(String cpu, String ram, String hdd) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }

    public void computerOn() {
        if (!isBurned) {
            if (cycleResource > 0) {
                int x = (int) (Math.random() * 2);
                System.out.println("Warning! Input 0 or 1");
                Scanner in = new Scanner(System.in);
                int num = in.nextInt();
                if (num == x) {
                    System.out.println("Computer off...");
                    cycleResource--;
                } else {
                    isBurned = true;
                }
            } else {
                System.out.println("Computer burned");
            }
        } else {
            System.out.println("Computer burned");
        }
    }

    public void getInf() {
        System.out.println("cpu is " + cpu + "ram is " + ram + "hdd is " + hdd + "number of cycles remaining is " + cycleResource);
    }

}
