package Practice18;

import java.util.Scanner;

public class Ex3 {
    public void exceptionDemo() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getClass().getCanonicalName());
        }
    }
// необходимо поймать общее исключение
    public static void main(String[] args) {
        Ex3 test = new Ex3();
        test.exceptionDemo();
    }
}