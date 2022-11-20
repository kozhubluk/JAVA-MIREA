package Practice18;

import java.util.Scanner;

//Шаг 1. Добавьте блок finally к решению Задания №2.
//Шаг 2. Повторно запустите программу, чтобы проверить ее
//поведение.

public class Ex4 {
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
        } finally { // блок, который выполняется независимо оттого, поймано ли исключение
            System.out.println("Final block completed");
        }
    }

    public static void main(String[] args) {
        Ex4 test = new Ex4();
        test.exceptionDemo();
    }
}