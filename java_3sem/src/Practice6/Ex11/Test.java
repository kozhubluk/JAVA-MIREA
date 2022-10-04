package Practice6.Ex11;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        double t;
        System.out.printf("Введите темп-ру в градусах Цельсия ");
        Scanner sc = new Scanner(System.in);
        t = sc.nextDouble();
        Fahrenheit f = new Fahrenheit(t);
        Kelvin k = new Kelvin(t);
        System.out.printf("в Фаренгейтах: %.2f\n", f.convert());
        System.out.printf("В Кельвинах: %.2f", k.convert());
    }
}
