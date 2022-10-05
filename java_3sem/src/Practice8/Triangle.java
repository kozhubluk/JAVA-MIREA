package Practice8;

import java.util.Scanner;

public class Triangle {
    public static void BuildTriangle(int n) {
        if (n < 1) return;
        if (n == 1) {
            System.out.println(1);
            return;
        }
        BuildTriangle(n-1);
        for (int i = n; i > 0; i--) {
            System.out.print(n + " ");
        }
        System.out.print("\n");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        BuildTriangle(n);
    }
}
