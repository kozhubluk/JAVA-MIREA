package Practice8;

import java.util.Scanner;

public class Summa2 {
    public static int DigitSumma(int k, int s, boolean firstZero) {//k - кол-во цифр, s - сумма, firstZero - может ли число начинаться с нуля
        int res = 0;
        if (9*k < s || s < 0 || k <= 0) return 0;
        if (k == 1) return 1;
        for (int i = (firstZero == true ? 0 : 1) ; i < 10; i++){
            res += DigitSumma(k-1, s-i, true);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k, s;
        k = sc.nextInt();
        s = sc.nextInt();
        System.out.println(DigitSumma(k, s, false));
    }

}
