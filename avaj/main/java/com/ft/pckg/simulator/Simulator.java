package com.ft.pckg.simulator;

import com.ft.pckg.aircraft.AircraftFactory;
import com.ft.pckg.aircraft.Flyable;
import com.ft.pckg.tower.WeatherTower;
import com.ft.pckg.utils.Coordinates;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Entry point of the aircraft simulation.
 *
 * <p>
 * Reads the scenario file, creates aircraft, registers them
 * to the WeatherTower and runs the simulation.
 * </p>
 */
public class Simulator {

    /**
     * Program entry point.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Simulator <scenario_file>");
            return;
        }

        WeatherTower weatherTower = new WeatherTower();
        List<Flyable> aircrafts = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {

            int simulations = Integer.parseInt(br.readLine().trim());
            if (simulations <= 0) {
                throw new IllegalArgumentException("Invalid simulation count");
            }

            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\s+");
                if (parts.length != 5) {
                    throw new IllegalArgumentException(
                        "Invalid aircraft description: " + line
                    );
                }

                Coordinates coordinates = new Coordinates(
                    Integer.parseInt(parts[2]),
                    Integer.parseInt(parts[3]),
                    Integer.parseInt(parts[4])
                );
                Flyable aircraft = AircraftFactory.newAircraft(
                        parts[0],
                        parts[1],
                        coordinates
                );

                aircraft.registerTower(weatherTower);
                aircrafts.add(aircraft);
            }

            for (int i = 0; i < simulations; i++) {
                weatherTower.changeWeather();
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
