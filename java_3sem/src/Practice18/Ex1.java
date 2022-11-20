package Practice18;


public class Ex1 {
    public void exceptionDemo() {
        try{ // блок, содержащий код, который может вызвать исключение
            System.out.println( 2/0 );
        } catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
        }
    }

    public static void main(String[] args) {
        Ex1 ex1 = new Ex1();
        ex1.exceptionDemo();
    }
}

