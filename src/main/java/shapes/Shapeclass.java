package shapes;

import java.awt.*;

public abstract class Shapeclass {
    protected Point center;
    protected Color color;

    public Shapeclass(Point center, Color color) {
        this.center = center;
        this.color = color;

    }

    public abstract void draw(Graphics g);
}
