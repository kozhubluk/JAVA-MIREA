package SecondWeek;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArr {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int i = 0; i < size; i++)
        {
            arr.add((int)(Math.random()*101));
        }
        System.out.println("Размер массива: " + size + "\n"+arr);

        int deleteNum, deleteDigit;
        deleteNum = sc.nextInt();

        for (int i = 0; i < size; i++)
        {
            if (arr.get(i) == deleteNum) {
                arr.remove(i);
                size--;
                i--;
            }
        }
        System.out.println("Размер массива: " + size + "\n"+arr);

        deleteDigit = sc.nextInt();
        for (int i = 0; i < size; i++)
        {
            if (arr.get(i) % 10 == deleteDigit)
            {
                arr.remove(i);
                size--;
                i--;
            }
        }
        System.out.println("Размер массива: " + size + "\n"+arr);
    }
}
