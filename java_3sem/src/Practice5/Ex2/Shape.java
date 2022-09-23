package Practice5.Ex2;

import java.awt.*;

public abstract class Shape {
    protected int x, y; // позиция, "центр фигуры"
    protected Color color; // цвет

    public Shape(int x, int y, Color color) { // конструктор
        this.x = x;
        this.y = y;
        this.color = color;
    }
    public abstract void drawFigure(Graphics g); // абстрактный метод, позволяющий нарисовать фигуру
}
