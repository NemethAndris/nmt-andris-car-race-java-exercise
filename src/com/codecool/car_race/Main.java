package com.codecool.car_race;


import com.codecool.car_race.logic.VehicleImplementations.Car;
import com.codecool.car_race.logic.VehicleImplementations.Motor;
import com.codecool.car_race.logic.VehicleImplementations.Truck;
import com.codecool.car_race.logic.Vehicles;

import java.util.ArrayList;
import java.util.List;

public class Main {


    /**
     * Creates all the vehicles that will be part of this race.
     */
    private static void createVehicles(Race race) {
        race.regiserRace(setUpCars());
        race.regiserRace(setUpMotor());
        race.regiserRace(setUpTrucks());
    }


    private static List<Vehicles> setUpCars() {
        List<Vehicles> carList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            carList.add(new Car());
        }
        return carList;
    }

    private static List<Vehicles> setUpMotor() {
        List<Vehicles> motorList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            motorList.add(new Motor());
        }
        return motorList;
    }

    private static List<Vehicles> setUpTrucks() {
        List<Vehicles> truckList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            truckList.add(new Truck());
        }
        return truckList;
    }


    /**
     * Entry point of our program. Creates one race instance and
     * uses that.
     * <p>
     *
     * @param args commandline arguments passed to the program.
     *             It is unused.
     */
    public static void main(String[] args) {
        Race race = new Race();
        createVehicles(race);

        Race.simulateRace();
        race.printRaceResults();


    }


}
