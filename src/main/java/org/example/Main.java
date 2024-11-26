package org.example;

import java.io.IOException;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import static org.example.LocationSystem.getCoords;
import static org.example.AlertSystem.*;

import java.io.InputStreamReader;
import java.net.*;;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) throws IOException {
        // Step 1: Instantiate an object of class Frame
        Keepers K1 = new Keepers("Geoff",80,4392);
        Lions L1 = new Lions("Simba",30,7);
        Drones D1 = new Drones("Moniter1",124,128);
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


        }catch (IOException e){
            throw new RuntimeException(e);

        }
        boolean b = Math.hypot((Math.abs(x - z)), Math.abs(y - c)) <= 60.0;

        if(b){
            alertAKeeper(String.valueOf(K1.PN));
            alertADrone(D1.RF);



        }



        Frame frame = new Frame("map");


        // Step 2: Instantiate an object of class Drawing
        Drawing drawing = new Drawing();

        // Step 3: Set properties of the Drawing object
        drawing.setSize(600, 600); // Set the canvas size
        drawing.setBackground(Color.WHITE); // Set the background color of the canvas

        // Step 4: Add the Drawing object to the Frame
        frame.add(drawing);


        // Step 5: Set properties of the Frame object
        frame.setSize(600, 600); // Set the frame size
        frame.setLayout(null); // No layout manager needed
        frame.setVisible(true); // Make the frame visible



        // Step 6: Add a window listener to handle the window close event
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose(); // Close the window when the close button is clicked
            }
        });
    }
}


