package Practice6.Print;

import java.util.ArrayList;
import java.util.Scanner;

public class TestPrint {
    public static void main(String[] args) {
        System.out.println("Введите название книги и автора: ");
        Scanner sc = new Scanner(System.in);
        Book b = new Book(sc.nextLine(), sc.nextLine());
        System.out.println("Введите название журнала: ");
        Magazine s = new Magazine(sc.nextLine());

        ArrayList<Printable> arr = new ArrayList<>();
        arr.add(s);
        arr.add(b);
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(i+1 + " - ");
            arr.get(i).print();
        }
    }
}
