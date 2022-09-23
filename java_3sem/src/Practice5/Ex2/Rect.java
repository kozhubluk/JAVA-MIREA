package Practice5.Ex2;

import java.awt.*;
import java.util.Random;

public class  Rect extends Shape {
    private int w, h;

    @Override
    public void drawFigure(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, w, h);
    }

    @Override
    public void randomFill() {
        Random rand = new Random();
        color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
        x = rand.nextInt(300);
        y = rand.nextInt(300);
        w = 10 + rand.nextInt(41);
        h = 10 + rand.nextInt(41);
    }
}
