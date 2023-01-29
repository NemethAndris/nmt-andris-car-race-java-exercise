package com.codecool.car_race.logic.VehicleImplementations;

import com.codecool.car_race.logic.Vehicles;

import java.util.Random;

public class Motor extends Vehicles {
    private static int nameCount = 0;
    private static boolean isRaining = false;


    public boolean isRaining() {
        return isRaining;
    }

    public void setRaining(boolean raining) {
        isRaining = raining;
    }


    @Override
    public void setName(String name) {
        nameCount++;
        super.setName(name + nameCount);
    }

    @Override
    public int getActualSpeed() {
        if (isRaining) {
            return getRandomNumberForSpeed();
        } else {
            return 100;
        }
    }

    public Motor() {
        this.setName("Motorcycle ");
        super.setDistanceTraveled(0);


    }

    private int getRandomNumberForSpeed() {
        Random random = new Random();

        int randomNumber = random.nextInt(5, 50);

        return randomNumber;
    }


    @Override
    public void prepareForLap() {
        setRaining(Weather.getIsRaining());
        setActualSpeed(getActualSpeed());

    }

    @Override
    public void moveForAnHour() {
        prepareForLap();
        setDistanceTraveled(getDistanceTraveled() + getActualSpeed());
    }
}
