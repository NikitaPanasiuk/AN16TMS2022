package by.tms.library;

public class Reader {
    String fullName;
    int numberOfReaderCard;
    String faculty;
    String birthDate;
    int phoneNumber;

    public Reader(String fullName, int numberOfReaderCard, String faculty, String birthDate, int phoneNumber) {
        this.fullName = fullName;
        this.numberOfReaderCard = numberOfReaderCard;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(String... bookName) {
        for (String s : bookName) {
            System.out.println(fullName + " took " + s);
        }
    }

    public void takeBook(int numberOfBook) {
        System.out.println(fullName + "took " + numberOfBook + " book(s)");
    }

    public void takeBook(Book... book) {
        for (Book value : book) {
            System.out.println(fullName + "took" + value.name);
        }
    }

    public void returnBook(String... bookName) {
        for (String s : bookName) {
            System.out.println(fullName + " returned " + s);
        }
    }

    public void returnBook(int numberOfBook) {
        System.out.println(fullName + " returned " + numberOfBook + " book(s)");
    }

    public void returnBook(Book... book) {
        for (Book value : book) {
            System.out.println(fullName + " returned " + value.name);
        }
    }
}

