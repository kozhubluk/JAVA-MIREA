package Practice19;

public class EmptyStringException extends Exception {
    public EmptyStringException() {
        super("Пустая строка");
    }
}