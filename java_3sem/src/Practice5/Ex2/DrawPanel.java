package Practice5.Ex2;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class DrawPanel extends JPanel {
    ArrayList<Shape> shapes = new ArrayList<Shape>();
    public void paint(Graphics g) {
        super.paint(g);
        setDoubleBuffered(true);
        for (Shape s : shapes) s.drawFigure(g);
    }
    public void drawCircle() {
        Circle c = new Circle();
        c.randomFill();
        shapes.add(c);
    }
    public void drawRect() {
        Rect r = new Rect();
        r.randomFill();
        shapes.add(r);
    }
    public void drawRandom() {
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            if (r.nextInt(40) % 2 == 0) drawRect();
            else drawCircle();
        }
    }
}