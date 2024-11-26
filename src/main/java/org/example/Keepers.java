package org.example;

public class Keepers extends Members {
    public int PN;
    public Keepers(String name ,int GPSID,int PN) {
        super(name,GPSID);
        this.PN=PN;
    }
}
