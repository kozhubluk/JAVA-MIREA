package Practice32;

import Practice30.*;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.io.IOException;
import java.io.*;

public class Ex1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        MenuItem dish1 = new Dish(3, "Стейк", "Описание1");
        MenuItem dish2 = new Dish(3, "Цезарь", "Описание2");
        MenuItem dish3 = new Dish(2, "Суп грибной", "Описание3");
        MenuItem dish4 = new Dish(3, "Плов", "Описание4");
        MenuItem dish5 = new Dish(4, "Пельмени", "Описание5");
        MenuItem drink1 = new Drink(1, "Липтон", "Описание6", 0, DrinkTypeEnum.GREEN_TEA);
        MenuItem drink2 = new Drink(4, "Вино красное", "Описание7", 0.15, DrinkTypeEnum.WINE);
        MenuItem drink3 = new Drink(9, "Святой источник", "Описание8", 0, DrinkTypeEnum.WATER);
        TableOrdersManager tm = new TableOrdersManager();
        tm.add(new TableOrder(), 3);
        tm.add(new TableOrder(), 5);
        tm.add(dish1, 3);
        tm.add(dish3, 3);
        tm.add(dish5, 3);
        tm.add(drink1, 3);
        tm.add(drink1, 3);

        tm.add(dish2, 5);
        tm.add(dish4, 5);
        tm.add(drink2, 5);

        InternetOrdersManager im = new InternetOrdersManager();
        Address a =new Address("moscow", 32, "lenina", 32, 'a', 4);
        Customer c = new Customer("ivan", "ivanov", 20, a);
        InternetOrder io = new InternetOrder();
        io.add(drink3);
        io.add(dish1);
        im.add(io);
        // создаем два потока
        // один из них записывает в файл
        // другой преобразует объекты в байты
        FileOutputStream outputStream = new FileOutputStream("save.ser"); // сериализация
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(im);
        objectOutputStream.writeObject(tm);

        //закрываем поток и освобождаем ресурсы

        objectOutputStream.close();
        System.out.println("Интеренет заказ");
        FileInputStream fileInputStream = new FileInputStream("save.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        InternetOrdersManager internet = (InternetOrdersManager) objectInputStream.readObject();
        TableOrdersManager table = (TableOrdersManager) objectInputStream.readObject();
        internet.print();
        System.out.println("\nЗаказы в ресторане");
        table.getOrder(5).print();
        System.out.println();
        table.getOrder(3).print();
        System.out.println("\n---Удалим липтон (все позиции)---\n");
        table.getOrder(3).removeAll("Липтон");
        table.getOrder(3).print();
    }
}
