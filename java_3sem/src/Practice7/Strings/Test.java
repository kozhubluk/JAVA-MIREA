package Practice7.Strings;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String testString;
        Scanner sc = new Scanner(System.in);
        StringFunc sf = new StringFunc();
        testString = sc.nextLine();
        System.out.println("ДЛИНА " + sf.length(testString));
        System.out.println("ПЕРЕВЕРНУТАЯ СТРОКА " + sf.revers(testString));
        System.out.println("НОВАЯ СТРОКА " + sf.oddString(testString));
    }
}
