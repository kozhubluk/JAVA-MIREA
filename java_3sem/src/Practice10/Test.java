package Practice10;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.print("Введите кол-во студентов: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student iDNumber[] = new Student[n];
        for (int i = 0; i < n; i++)
        {
            iDNumber[i] = new Student();
        }

        for (int j = 1; j < n; j++) // сортировка вставками
        {
            int key = iDNumber[j].getId();
            int i = j - 1;
            for(; i>=0; i--)
            {
                if (key < iDNumber[i].getId()) iDNumber[i + 1].setId(iDNumber[i].getId());
                else break;
            }
            iDNumber[i+1].setId(key);
        }
        System.out.println("Отсортированный список ID:");
        for (int i = 0; i < n; i++)
        {
            System.out.println(iDNumber[i].getId());
        }
    }

}
