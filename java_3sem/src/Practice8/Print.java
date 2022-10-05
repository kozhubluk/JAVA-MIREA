package Practice8;

import java.util.Scanner;

public class Print {
    public static void printNumbers(int n) {
        if (n < 1) return;
        if (n == 1) {
            System.out.print(1 + " ");
            return;
        }
        printNumbers(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNumbers(n);
    }
}
