package FirstWeek;

public class Row {
    public static void main(String[] args) {
        double ans;
        double sum = 0;
        for (double i = 1; i < 10; i++) {
            ans = 1/i;
            sum += ans;
            System.out.printf("%.3f", ans);
            System.out.printf(" ");
        }
        System.out.printf("%.3f", sum);
    }
}
