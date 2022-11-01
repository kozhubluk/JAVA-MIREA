package Practice14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex4 {
        public static void main(String[] args){
            String str1 = "(1 + 8) – 9 / 4"; // пример правильного
            String str2 = "6 / 5 – 2 * 9"; // пример неправильного
            Pattern pattern = Pattern.compile("\\d\\s*\\+");
            Matcher matcher1 = pattern.matcher(str1);
            Matcher matcher2 = pattern.matcher(str2);

            System.out.println(matcher1.find());
            System.out.println(matcher2.find());
    }
}
