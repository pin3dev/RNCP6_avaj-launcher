package com.ft.pckg.simulator;

import com.ft.pckg.tower.WeatherTower;

/**
 * Entry point of the aircraft simulation.
 *
 * <p>
 * Orquestrates the simulation by:
 * Reads the scenario file, creates aircraft, registers them
 * to the WeatherTower and runs the simulation.
 * </p>
 */
public class Simulator {

    /** Default constructor. */
    public Simulator() {}
    
    /**
     * Main method - entry point of the simulation.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("[Usage]: java Simulator <scenario_file>");
            System.out.println("or");
            System.out.println("[Usage]: make");
            return;
        }

        try {
            WeatherTower tower = new WeatherTower();

            ScenarioReader reader = new ScenarioReader();
            ScenarioReader.Scenario scenario = reader.read(args[0]);

            AircraftLoader loader = new AircraftLoader();
            loader.load(scenario.aircraftData, tower);

            SimulatorRunner runner = new SimulatorRunner();
            runner.run(tower, scenario.simulations);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            //e.printStackTrace();
        }
    }
}

