package Practice14;

import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex8 {
    public static void main(String[] args) {
        System.out.println("Введите текст: ");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine().toLowerCase();
        Pattern pattern = Pattern.compile("[а-я]");
        HashMap<String, Integer> dictionary = new HashMap<>(33);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()) {
            if(dictionary.containsKey(matcher.group()))
                dictionary.put(matcher.group(), dictionary.get(matcher.group()) + 1);
            else
                dictionary.put(matcher.group(), 1);
        }
        System.out.println(dictionary);

    }
}
