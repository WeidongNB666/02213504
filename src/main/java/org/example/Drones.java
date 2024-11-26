package org.example;

public class Drones extends Members{
    public int RF;
    public Drones(String name,int GPSID,int RF){
        super(name,GPSID);
        this.RF=RF;
    }
}
