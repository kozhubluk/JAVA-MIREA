package Practice6.Ex11;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        double t;
        System.out.printf("Введите темп-ру в градусах Цельсия ");
        Scanner sc = new Scanner(System.in);
        t = sc.nextDouble();
        Fahrenheit f = new Fahrenheit();
        Kelvin k = new Kelvin();
        System.out.printf("в Фаренгейтах: %.2f\n", f.convert(t));
        System.out.printf("В Кельвинах: %.2f", k.convert(t));
    }
}
