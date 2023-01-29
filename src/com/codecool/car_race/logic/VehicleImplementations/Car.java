package com.codecool.car_race.logic.VehicleImplementations;

import com.codecool.car_race.Race;
import com.codecool.car_race.data.CarNames;
import com.codecool.car_race.logic.Vehicles;

import java.util.List;
import java.util.Random;

public class Car extends Vehicles {

    private int normalSpeed;
    private List<String> nameList = CarNames.randomCarNames();


    public int getNormalSpeed() {
        return normalSpeed;
    }

    public void setNormalSpeed(int normalSpeed) {
        this.normalSpeed = normalSpeed;
    }


    @Override
    public int getActualSpeed() {
        if (Race.isYellowFlagActive()) {
            return 75;
        } else {
            return normalSpeed;
        }
    }

    public Car() {
        super.setDistanceTraveled(0);
        super.setName(createName());
        this.normalSpeed = createNormalSpeed();
    }

    private int getNumberForName() {
        Random random = new Random();

        int randomNumber = random.nextInt(0, nameList.size());

        return randomNumber;
    }

    private int getNumberForNormalSpeed() {
        Random random = new Random();

        int randomNumber = random.nextInt(80, 110);

        return randomNumber;
    }

    private String createName() {

        return nameList.get(getNumberForName()) + ", " + nameList.get(getNumberForName());

    }

    private int createNormalSpeed() {

        return getNumberForNormalSpeed();

    }


    @Override
    public void prepareForLap() {
        setActualSpeed(getActualSpeed());
    }

    @Override
    public void moveForAnHour() {
        prepareForLap();
        setDistanceTraveled(getDistanceTraveled() + getActualSpeed());
    }


}
