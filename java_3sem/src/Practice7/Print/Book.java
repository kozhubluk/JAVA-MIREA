package Practice7.Print;

public class Book implements Printable {
    private String author;
    private String name;

    public Book(String author, String name) {
        this.author = author;
        this.name = name;
    }

    public void print() {
        System.out.println("Автор: " + author + "    Название: " + name);
    }

    public static void printBooks(Printable[] printable) {
        for (int i = 0; i < printable.length; i++) {
            if (printable[i] instanceof Book) printable[i].print();
        }
    }
}
