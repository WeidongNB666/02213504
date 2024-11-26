package shapes;

import java.awt.Color;
import java.awt.Point;

public class Square extends Rect {
    public Square(Point center, Color color, int sideLength) {
        super(center, color, sideLength, sideLength);  // Pass equal width and height to make it a square
    }
}
