package com.ft.pckg.simulator;

import com.ft.pckg.aircraft.AircraftFactory;
import com.ft.pckg.aircraft.Flyable;
import com.ft.pckg.tower.WeatherTower;
import com.ft.pckg.utils.Coordinates;

import java.util.ArrayList;
import java.util.List;

/**  
 * Loads aircraft from scenario data and registers them to the WeatherTower.
 */
public class AircraftLoader {

    /**
     * Parses a line of aircraft data and creates a Flyable aircraft.
     * @param parts Array of strings representing aircraft data.
     * @return Flyable aircraft instance.
     */
    private Flyable parserFlyable(String[] parts) {
        String type = parts[0];
        String name = parts[1];
        int longitude = Integer.parseInt(parts[2]);
        int latitude = Integer.parseInt(parts[3]);
        int height = Integer.parseInt(parts[4]);

        return AircraftFactory.newAircraft(type, name, new Coordinates(longitude, latitude, height));
    }

    /**
     * Loads aircraft from scenario data and registers them to the WeatherTower.
     * @param data List of aircraft data arrays.
     * @param tower WeatherTower instance.
     */
    public void load(List<String[]> data, WeatherTower tower) {

        for (String[] parts : data) {
            Flyable aircraft = parserFlyable(parts);
            aircraft.registerTower(tower);
        }
    }

}
