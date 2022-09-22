package SecondWeek;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        int num, first; //  кол-во чисел для вывода и первое выводимое число
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        first = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        int n3;
        int nextN = n1 + n2; // 0, 1, 1, 2....
        int i = 0;
        while (i < num)
        {
            if (n1 >= first)
            {
                System.out.print(n1+" ");
                i++;
            }
            n1 = n2;
            n2 = nextN;
            nextN = n1 + n2;
        }
    }
}
