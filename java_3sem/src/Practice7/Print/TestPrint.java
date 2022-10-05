package Practice7.Print;

import java.util.Scanner;

public class TestPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Printable[] arr = new Printable[4];
        for (int i = 0; i < 2; i++) {
            System.out.println("Введите название книги и автора: ");
            Book b = new Book(sc.nextLine(), sc.nextLine());
            System.out.println("Введите название журнала: ");
            Magazine s = new Magazine(sc.nextLine());
            arr[i * 2] = b;
            arr[i * 2 + 1] = s;
        }
        System.out.println("ЖУРНАЛЫ");
        Magazine.printMagazines(arr);
        System.out.println("КНИГИ");
        Book.printBooks(arr);

    }
}
