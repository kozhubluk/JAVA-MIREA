package Practice7.Move;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты х и у 1й точки, скорость по x и y:");
        MovablePoint point1 = new MovablePoint(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println("Введите координаты х и у 2й точки, скорость по x и y:");
        MovablePoint point2 = new MovablePoint(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        MovableRectangle rectangle = new MovableRectangle(point1, point2);

        while (!rectangle.checkSpeed()) {
            System.out.println("ТОЧКИ ИМЕЮТ РАЗНЫЕ СКОРОСТИ, введите заново скорость по x и y для первой потом для второй точки");
            point1.setxSpeed(scanner.nextInt());
            point1.setySpeed(scanner.nextInt());
            rectangle.setTopLeft(point1);

            point2.setxSpeed(scanner.nextInt());
            point2.setySpeed(scanner.nextInt());
            rectangle.setBottomRight(point2);
        }
        System.out.println(rectangle);

        String command;
        command = scanner.next();
        while(true)
        {
            switch (command) {
                case "up":
                    rectangle.moveUp();
                    break;
                case "down":
                    rectangle.moveDown();
                    break;
                case "right":
                    rectangle.moveRight();
                    break;
                case "left":
                    rectangle.moveLeft();
                    break;
                case "end":
                    return;
            }
            System.out.println(rectangle);
            command = scanner.next();
        }

    }

}
