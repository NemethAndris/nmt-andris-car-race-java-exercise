package com.codecool.car_race;

import com.codecool.car_race.logic.VehicleImplementations.Car;
import com.codecool.car_race.logic.VehicleImplementations.Motor;
import com.codecool.car_race.logic.VehicleImplementations.Truck;
import com.codecool.car_race.logic.VehicleImplementations.Weather;
import com.codecool.car_race.logic.Vehicles;

import java.util.ArrayList;
import java.util.List;

public class Race {
    private static List<Vehicles> vehiclesList = new ArrayList<>();


    public void regiserRace(List<Vehicles> vehicles) {
        vehiclesList.addAll(vehicles);
    }

    /**
     * Simulates the passing of time by advancing the weather and
     * moving the vehicles for the duration of a whole race.
     */
    public static void simulateRace() {

        for (int i = 0; i < 50; i++) {
            Weather.advance();
            System.out.println(Weather.getIsRaining());
            for (Vehicles vehicle : vehiclesList) {
                vehicle.moveForAnHour();
                System.out.println(vehicle.getName() + ", " + vehicle.getDistanceTraveled() + ", " + vehicle.getClass());
            }
        }


    }

    /**
     * Prints the state of all vehicles. Called at the end of the
     * race.
     */
    public void printRaceResults() {
        for (Vehicles vehicle : vehiclesList) {
            // System.out.println( vehicle.getName() + ": " + vehicle.getDistanceTraveled() + ": " + vehicle.getClass());

        }
    }


    public static boolean isYellowFlagActive() {
        for (Vehicles vehicle : vehiclesList) {
            if (vehicle instanceof Truck) {
                Truck truck = (Truck) vehicle;
                if (truck.isBreakDown()) {
                    return true;
                }
            }
        }
        return false;
    }

}
