package com.ft.pckg.simulator;

import com.ft.pckg.tower.WeatherTower;

/**
 * Runs the aircraft simulation for a specified number of cycles.
 */

public class SimulatorRunner {

    public void run(WeatherTower tower, int cycles) {
        for (int i = 0; i < cycles; i++) {
            tower.changeWeather();
        }
    }
}
