package Practice25;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex4 { // ско,rb
    private static boolean checkExpression(String s) {
        Pattern pattern = Pattern.compile("\\([\\s\\d+/*-]*?\\)");
        Matcher matcher = pattern.matcher(s);
        do {
            s = matcher.replaceAll(""); // удаляем все соответствия
            matcher = pattern.matcher(s);
        } while (matcher.find());
        return s.matches("[\\s\\d+/*-]*?");
    }
    public static void main(String[] args) {
        System.out.println(checkExpression("4+(9*4/(34-3))"));
        System.out.println(checkExpression("(3 + 5) - 3 * 4"));
        System.out.println(checkExpression("((3+5)–9/4")); // неправильная
    }
}
