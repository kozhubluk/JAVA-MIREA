package Practice2.Ex7;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Book[] book = new Book[size];
        for(int i=0; i<size; i++){
            book[i] = new Book(sc.next(), sc.next(), sc.nextInt());
        }

        Library lib = new Library(book);
        System.out.println(lib);
        lib.sortBook();
        System.out.println(lib);
        System.out.println(lib.last());
        System.out.println(lib.first());
    }
}