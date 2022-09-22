package Practice2.Ex3;

import java.util.Arrays;
import java.util.Scanner;

public class TestCircle {
    private int n;
    public static Circle[] circles;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        circles = new Circle[n];
        for (int i = 0; i < n; i++) {
            circles[i] = new Circle(new Point(sc.nextDouble(), sc.nextDouble()), sc.nextDouble());
        }
        System.out.println(Arrays.toString(circles));
    }
}
