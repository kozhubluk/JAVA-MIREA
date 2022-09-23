package Practice5.Ex2;

import java.awt.*;

public class Circle extends Shape {
    private int radius;

    public Circle(int x, int y, Color color) {
        super(x, y, color);
    }

    @Override
    public void drawFigure(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, radius, radius);
    }
}
