package com.ft.pckg.simulator;

import com.ft.pckg.tower.WeatherTower;

/**
 * Runs the aircraft simulation for a specified number of cycles.
 */

public class SimulatorRunner {

    /** Default constructor. */
    public SimulatorRunner() {}

    /**
     * Runs the simulation for the given number of cycles.
     * @param tower WeatherTower instance.
     * @param cycles Number of simulation cycles to run.
     */
    public void run(WeatherTower tower, int cycles) {
        for (int i = 0; i < cycles; i++) {
            tower.changeWeather();
        }
    }
}
