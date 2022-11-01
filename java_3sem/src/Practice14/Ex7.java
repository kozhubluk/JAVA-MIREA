package Practice14;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex7 {
    public static void main(String[] args) {
        String[] test = {"F032_Password", "TrySpy_8", "smart_pass", "A007"};
    // ?=.* - встречается хотя бы раз
        for (int i = 0; i < 4; i++) {
            System.out.println(Pattern.matches("^\\w+(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])\\w{7,}$", test[i]));
        }
    }
}
