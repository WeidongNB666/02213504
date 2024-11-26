package shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Circle implements Shape {
    private int radius;
    private Point center;
    private Color color;

    public Circle(int radius, Point center, Color color) {
        this.radius = radius;
        this.center = center;
        this.color = color;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(center.x - radius, center.y - radius, radius * 2, radius * 2);  // Draws a filled circle
    }
}

