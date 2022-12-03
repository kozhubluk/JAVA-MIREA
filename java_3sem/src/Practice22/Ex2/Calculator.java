package Practice22.Ex2;


import java.util.EmptyStackException;
import java.util.Stack;

public class Calculator {

    private static Stack<Double> stack;

    public static String calculate(String s) {
        double n1, n2;
        s = s.trim().replaceAll("\\s+", " ");
        String o;
        String sArray[] = s.split(" ");
        Stack<Double> stack = new Stack<>();
        for (int i = 0; i < sArray.length; i++) {
            try {
                stack.push(Double.parseDouble(sArray[i]));
            }
            catch (NumberFormatException e) {
                try {
                    if (!(sArray[i].equals("+") || sArray[i].equals("-") || sArray[i].equals("*") || sArray[i].equals("/"))) throw new NumberFormatException();
                    n1 = stack.pop();
                    n2 = stack.pop();
                    if (sArray[i].equals("-")) stack.add(n2 - n1);
                    else if (sArray[i].equals("+")) stack.add(n2 + n1);
                    else if (sArray[i].equals("/")) stack.add(n2 / n1);
                    else if (sArray[i].equals("*")) stack.add(n2 * n1);
                }
                catch (EmptyStackException ex) {
                    return "Нельзя выполнить POP для пустого стека";
                }
                catch (NumberFormatException ex) {
                    return "Некорректный ввод";
                }
            }
        }
        return Double.toString(stack.pop());
    }
}