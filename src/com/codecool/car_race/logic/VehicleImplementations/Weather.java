package com.codecool.car_race.logic.VehicleImplementations;

import java.util.Arrays;
import java.util.Random;

public class Weather {
    private static boolean isRaining;

    public static void advance() {
        int[] validNumbers = {1, 2, 3};
        Random random = new Random();
        int num = random.nextInt(1, 10);

        boolean chanceToRain = Arrays.stream(validNumbers).anyMatch(i -> i == num);

        if (chanceToRain) {
            isRaining = true;
        } else {
            isRaining = false;
        }
    }

    public static boolean getIsRaining() {
        return isRaining;
    }
}
