package Practice13.Task3;

public class Test {
    public static void main(String[] args) {
        Address address = new Address();
        address.setAddress1("Россия, Алтайский край, Барнаул, Ленина, 54, 34, 2");
        System.out.println(address);
        address.setAddress2("Россия, Тульская область, Кимовск, Крылова, 14, 2, 6");
        System.out.println(address);
        address.setAddress2("Россия. Республика Бурятия. Улан-Удэ. Гагарина. 34. 1. 1");
        System.out.println(address);
        address.setAddress2("Казахстан; Алматинская область; Алматы; Веселая; 24; 4; 5");
        System.out.println(address);
    }
}
