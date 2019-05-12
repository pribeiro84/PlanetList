package com.android.example.planetlist;
import java.io.Serializable;

public class Planet implements Serializable {
    String name;
    int distance;
    boolean gasGiant;

    public Planet(String planetName, int planetDistance, boolean gasGiant){
        this.name = planetName;
        this.distance = planetDistance;
        this.gasGiant = gasGiant;
    }

    public String getName()
    {
        return name;
    }

    public int getDistance()
    {
        return distance;
    }

    public boolean isGasGiant()
    {
        return gasGiant;
    }
}
