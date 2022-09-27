package Practice6.Ex3;

import java.util.Scanner;

public class TestTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Nameable first = new Pet(sc.next(), sc.nextInt());
        Nameable second = new Planet(sc.next());
        System.out.println(first.getName()+ " " + second.getName());
    }
}
