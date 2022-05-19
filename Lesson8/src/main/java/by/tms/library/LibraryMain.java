package by.tms.library;

import java.util.Objects;
import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input num of reader");
        int n = in.nextInt();
        Reader[] arr = new Reader[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Input full name, number of reader card, faculty, birth date, phone number");
            arr[i] = new Reader(in.next(), in.nextInt(), in.next(), in.next(), in.nextInt());
        }
        System.out.println("Input full name and number of reader card to see inf about");
        String name = in.next();
        int readerCard = in.nextInt();
        for (Reader reader : arr) {
            if (Objects.equals(name, reader.fullName) && readerCard == reader.numberOfReaderCard) {
                reader.takeBook("Pif paf", "pif Puf", "Bla bla bla", "sIk");
                reader.takeBook(4);
                reader.takeBook(new Book("Witcher", "Sapkovski"));
                reader.returnBook(4);
                reader.returnBook("Pif paf", "pif Puf", "Bla bla bla", "sIk");
                reader.returnBook(new Book("Witcher", "Sapkovski"));
            }
        }
    }
}
