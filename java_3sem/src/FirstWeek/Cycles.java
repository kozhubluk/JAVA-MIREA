package FirstWeek;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Cycles {
    public static void main(String[] args) {
        int[] arr;
        int size;
        int ans;
        System.out.println("Введите размер массива");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = sc.nextInt();
        ans = 0;
        for (int i = 0; i < size; i++) ans += arr[i];
        System.out.println(ans);
        ans = 0;
        int j = 0;
        while (j < size) {
            ans += arr[j];
            j++;
        }
        System.out.println(ans);
        ans = 0;
        int k = 0;
        do {
            ans += arr[k];
            k++;
        } while (k != size);
        System.out.println(ans);
    }

}
