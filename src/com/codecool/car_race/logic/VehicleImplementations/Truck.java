package com.codecool.car_race.logic.VehicleImplementations;

import com.codecool.car_race.logic.Vehicles;

import java.util.Random;

public class Truck extends Vehicles {

    private boolean isBreakDown = false;

    private int hourCounter = 0;

    public boolean isBreakDown() {
        return isBreakDown;
    }

    public void setBreakDown(boolean breakDown) {
        isBreakDown = breakDown;
    }

    @Override
    public int getActualSpeed() {
        if (isBreakDown) {
            return 0;
        } else {
            return 100;
        }
    }

    public Truck() {
        super.setName(createName());
    }

    private int getNumberForName() {
        Random random = new Random();

        int randomNumber = random.nextInt(0, 1000);

        return randomNumber;
    }

    private String createName() {

        return String.valueOf(getNumberForName());

    }

    private boolean get5PercentChance() {
        Random random = new Random();
        int num = random.nextInt(1, 20);

        return num == 1;
    }


    @Override
    public void prepareForLap() {
        setActualSpeed(getActualSpeed());
    }

    @Override
    public void moveForAnHour() {
        prepareForLap();
        if (isBreakDown) {
            if (hourCounter < 2) {
                hourCounter++;
            } else {
                setBreakDown(false);
            }
        }

        if (get5PercentChance()) {
            setBreakDown(true);
        } else {
            setBreakDown(false);
        }

        setDistanceTraveled(getDistanceTraveled() + getActualSpeed());

    }
}
