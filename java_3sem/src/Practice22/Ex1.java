package Practice22;

import java.util.Scanner;
import java.util.Stack;

public class Ex1 {

    public static int f(String s) {
        int n1, n2;
        String o;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.split(" ").length; i++) {
            try {
                stack.push(Integer.parseInt(s.split(" ")[i]));
            } catch (NumberFormatException e) {
                n1 = stack.pop();
                n2 = stack.pop();
                if (s.split(" ")[i].equals("-")) stack.add(n2 - n1);
                if (s.split(" ")[i].equals("+")) stack.add(n2 + n1);
                if (s.split(" ")[i].equals("/")) stack.add(n2 / n1);
                if (s.split(" ")[i].equals("*")) stack.add(n2 * n1);
            }
        }
        return(stack.pop());
    }
    public static void main(String[] args){
        System.out.println(f("8 2 5 * + 1 3 2 * + 4 - /")); // 6
        System.out.println(f("3 5 9 10 - * +")); // -2
    }
}
