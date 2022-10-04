package Practice7.Ex4;

import java.util.Scanner;

public class TestMath {
    public static void main(String[] args) {
        MathFunc mathfunc = new MathFunc();
        Scanner sc = new Scanner(System.in);
        System.out.println("ВОЗВЕДЕНИЕ В СТЕПЕНЬ");
        System.out.printf("%.1f\n",mathfunc.pow(sc.nextDouble(), sc.nextInt()));
        System.out.println("МОДУЛЬ КОМПЛЕКСНОГО ЧИСЛА");
        System.out.printf("%.1f\n",mathfunc.module(sc.nextDouble(), sc.nextDouble()));
        System.out.println("ДЛИНА ОКРУЖНОСТИ");
        System.out.printf("%.1f\n",mathfunc.CircleLength(sc.nextDouble()));
    }
}
