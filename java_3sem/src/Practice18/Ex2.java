package Practice18;

import java.util.Scanner;

public class Ex2 {
    public void exceptionDemo() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        } catch (NumberFormatException e) {
            System.out.println("Could not convert to int");
        }
    }

// Запустите эту программу со следующими выводами: Qwerty
// 0 1.2 1. Посмотрите на вывод.

    public static void main(String[] args) {
        Ex2 test = new Ex2();
        test.exceptionDemo();
    }
}