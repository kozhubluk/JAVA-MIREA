package Practice6.Print;

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
}
