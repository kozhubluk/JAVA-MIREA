package Practice11;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex5 {
    public static void main(String[] args) {
        ArrayList<Integer> testAL = new ArrayList<>();
        LinkedList<Integer> testLL = new LinkedList<>();
        for (int i = 0; i < 1000; i++) { // заполняем случайными числами
            testAL.add((int)(Math.random()*100));
            testLL.add(testAL.get(i));
        }

        long time  = System.nanoTime();

        testAL.add(66); //добавление
        time = System.nanoTime() - time;
        System.out.print("Arraylist ADD: ");
        System.out.printf("%.3f ms\n", time / 1000000.0);

        time = System.nanoTime();
        testLL.add(66);
        time = System.nanoTime() - time;
        System.out.print("linkedlist ADD: ");
        System.out.printf("%.3f ms\n", time / 1000000.0);

        time = System.nanoTime(); //ВСТАВКА
        testAL.add(0, 2);
        time = System.nanoTime() - time;
        System.out.print("Arraylist INSERT: ");
        System.out.printf("%.3f ms\n", time / 1000000.0);

        time = System.nanoTime();
        testLL.add(0, 2);
        time = System.nanoTime() - time;
        System.out.print("linkedlist INSERT: ");
        System.out.printf("%.3f ms\n", time / 1000000.0);

        time = System.nanoTime(); // ПОИСК
        testAL.indexOf(66);
        time = System.nanoTime() - time;
        System.out.print("Arraylist FIND: ");
        System.out.printf("%.3f ms\n", time / 1000000.0);

        time = System.nanoTime();
        testLL.indexOf(66);
        time = System.nanoTime() - time;
        System.out.print("linkedlist FIND: ");
        System.out.printf("%.3f ms\n", time / 1000000.0);

        time = System.nanoTime(); // УДАЛЕНИЕ
        testAL.remove(0);
        time = System.nanoTime() - time;
        System.out.print("Arraylist REMOVE: ");
        System.out.printf("%.3f ms\n", time / 1000000.0);

        time = System.nanoTime();
        testLL.remove(0);
        time = System.nanoTime() - time;
        System.out.print("linkedlist REMOVE: ");
        System.out.printf("%.3f ms\n", time / 1000000.0);
    }
}
