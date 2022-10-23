package Practice11;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendar calendar = new GregorianCalendar();
        Date nowTime = new Date(); // текущее время
        System.out.println("Введите год, месяц и день месяца");
        calendar.set(Calendar.YEAR, sc.nextInt());
        calendar.set(Calendar.MONTH, sc.nextInt());
        calendar.set(Calendar.DAY_OF_MONTH, sc.nextInt());
        System.out.println("Введите время: часы, минуты и секуенды");
        calendar.set(Calendar.HOUR_OF_DAY, sc.nextInt());
        calendar.set(Calendar.MINUTE, sc.nextInt());
        calendar.set(Calendar.SECOND, sc.nextInt());
        Date userTime = calendar.getTime();
        System.out.println("Введенная дата "+((userTime.getTime() < nowTime.getTime())? "раньше" : "позже") + " текущей");
    }

}


