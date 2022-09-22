package Practice2.Ex1;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Author test = new Author ("Jack", "jk@ya.ru", 'm');
        // геттеры
        System.out.println("имя: " + test.getName());
        System.out.println("email: " + test.getEmail());
        System.out.println("пол: " + test.getGender());
        // сеттер
        String newEmail;
        newEmail = sc.nextLine();
        // to string
        test.setEmail(newEmail);
        System.out.println(test);
    }
}
