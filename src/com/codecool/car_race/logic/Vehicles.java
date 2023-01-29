package com.codecool.car_race.logic;

public abstract class Vehicles {
    String name;

    int actualSpeed;

    int distanceTraveled;


    public Vehicles(String name, int actualSpeed, int distanceTraveled) {
        this.name = name;
        this.actualSpeed = actualSpeed;
        this.distanceTraveled = distanceTraveled;
    }

    public Vehicles() {
    }


    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(int distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    public int getActualSpeed() {
        return actualSpeed;
    }

    public void setActualSpeed(int actualSpeed) {
        this.actualSpeed = actualSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void prepareForLap();

    public abstract void moveForAnHour();

}
