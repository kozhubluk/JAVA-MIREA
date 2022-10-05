package Practice8;

import java.util.Scanner;

public class Summa {
    public static int DigitSumma(int n) {
        if (n <= 0) return 0;
        return (n%10) + DigitSumma(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(DigitSumma(n));
    }
}
