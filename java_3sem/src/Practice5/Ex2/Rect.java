package Practice5.Ex2;

import java.awt.*;

public class  Rect extends Shape {
    private int w, h;

    public Rect(int x, int y, Color color, int w, int h) {
        super(x, y, color);
        this.w = w;
        this.h = h;
    }

    @Override
    public void drawFigure(Graphics g) {
        g.setColor(color);
        g.clearRect(x, y, w, h);
    }
}
