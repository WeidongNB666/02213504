package shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
public class Rect implements Shape {
    protected int w,h;
    protected Point center;
    protected Color color;
    public Rect(Point center,Color color, int w, int h) {
        this.w = w;
        this.h = h;
        this.center = center;
        this.color = color;
    }
    public void draw(Graphics r) {
        r.setColor(color);

        r.fillRect(center.x, center.y, w, h);
    }
}
