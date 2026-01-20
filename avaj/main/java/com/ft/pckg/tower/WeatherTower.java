package com.ft.pckg.tower;

import com.ft.pckg.utils.Coordinates;
import com.ft.pckg.weather.WeatherProvider;

/**
 * Concrete Subject that notifies aircraft about weather changes.
 *
 * <p>
 * Extends Tower and provides weather information
 * through the WeatherProvider singleton.
 * </p>
 * 
 * <p>
 * Design Pattern used: Observer (Concrete Observable/Publisher/Subject).
 * </p>
 */
public class WeatherTower extends Tower {

    /**
     * Returns the current weather for given coordinates.
     *
     * @param coordinates the coordinate used to get the weather by calling WeatherProvider
     * @return the current weather as a string
     */
    public String getWeather(Coordinates coordinates) {
        return WeatherProvider.getProvider().getCurrentWeather(coordinates);
    }

    /**
     * Triggers a weather change and notifies all Observers/Listeners.
     */
    public void changeWeather() {
        notifyObservers();
    }
}
