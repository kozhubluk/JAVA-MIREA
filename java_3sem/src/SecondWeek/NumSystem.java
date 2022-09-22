package SecondWeek;

import java.util.Scanner;

public class NumSystem {
    public static String newNumFunc(double num, int not){
        String res = "";
        int tempInt = (int)num;
        while (tempInt > 0) // Целая часть числа
        {
            if (tempInt % not < 10)
            {
                res = String.valueOf(tempInt % not) + res;
            }
            else
            {
                res = (char)(55 + tempInt % not) + res;
            }
            tempInt = tempInt / not;
        }
        double tempFraction = num % 1;
        res += ",";
        for (int i = 0; i < 3; i++)
        {
            tempFraction *= not;
            if (tempFraction < 10)
            {
                res += String.valueOf((int)(tempFraction));
            }
            else {
                res += (char)(55 + (int)tempFraction);
            }
            tempFraction = tempFraction % 1;
        }
        return res;
    }

    public static void main(String[] args){
        double num; // число переводимое в новую сс
        int not; // основание сс
        String numNew, num2, num16;
        Scanner sc = new Scanner(System.in);
        num = sc.nextDouble();
        not = sc.nextInt();
        num2 = newNumFunc(num, 2);
        num16 = newNumFunc(num, 16);
        numNew = newNumFunc(num, not);
        System.out.println("2сс: " + num2 + "\n16cc: "  + num16 + "\n" + not +"cc: " + numNew);
    }
}
