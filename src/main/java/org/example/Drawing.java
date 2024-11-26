package org.example;

import shapes.Circle;
import shapes.Rect;
import shapes.Shape;
import shapes.Square;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import java.io.IOException;

import static org.example.LocationSystem.getCoords;

public class Drawing extends Canvas {
    Keepers K1 = new Keepers("Geoff",80,4392);
    Lions L1 = new Lions("Simba",30,7);
    Drones D1 = new Drones("Moniter1",124,128);
    private List<shapes.Shape> shapes;



    // Constructor
    public Drawing() {


        shapes = new ArrayList<>();
        double x;
        double y;
        double z;
        double c;
        double r;
        double a;
        try {
            x = (getCoords(K1.GPSID)).getX();
            y = (getCoords(K1.GPSID)).getY();
            z =(getCoords(L1.GPSID)).getX();
            c=(getCoords(L1.GPSID)).getY();
            r=(getCoords(D1.GPSID)).getX();
            a=(getCoords(D1.GPSID)).getY();

        } catch (IOException e) {
            throw new RuntimeException(e);

        }

        // Create and add different shapes to the list
        shapes.add(new Circle(2, new Point((int) x, (int) y), Color.blue));
        shapes.add(new Circle(3, new Point((int) z, (int) c), Color.red));
        shapes.add(new Square(new Point((int) r, (int) a), Color.black, 3));

    }

    @Override
    public void paint(Graphics g) {
        try{Thread.sleep(1000);}
        catch(InterruptedException e){}

        for (Shape shape : shapes) {
            shape.draw(g);
            repaint();

        try {
                double x = (getCoords(K1.GPSID)).getX();
                double y = (getCoords(K1.GPSID)).getY();
                g.drawString(K1.name+"Phone Number:"+K1.PN, (int)x, (int)y );

                double z = (getCoords(L1.GPSID)).getX();
                double c = (getCoords(L1.GPSID)).getY();
                double r = (getCoords(D1.GPSID)).getX();
                double a = (getCoords(D1.GPSID)).getY();

                g.drawString(L1.name+"Age:"+L1.Age, (int)z, (int) c );
                g.drawString(D1.name+"frequency:"+D1.RF+"MHz", (int)r, (int)a );
                repaint();
            }catch (IOException e){
                throw new RuntimeException(e);

            }


        }
    }
}



