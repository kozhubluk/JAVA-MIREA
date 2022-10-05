package Practice8;


import java.util.Scanner;

public class Print2 {
    public static void printNumbers(int a, int b) {
        if (a - b < 0) printNumbers(a, b-1);
        else if (a - b > 0) printNumbers(a, b+1);
        System.out.print(b + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        printNumbers(a, b);
    }
}
