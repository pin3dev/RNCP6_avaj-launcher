package com.ft.pckg.weather;

import com.ft.pckg.utils.Coordinates;

/**
 * Singleton class responsible for providing weather information
 * based on coordinates.
 *
 * <p>
 * This class generates deterministic weather using the sum of
 * longitude, latitude and height as a seed.
 * </p>
 *
 * <p>
 * Design Pattern used: Singleton.
 * </p>
 */
public class WeatherProvider {

    /** Single instance of WeatherProvider. */
    private static WeatherProvider instance;
    /** Static array copy of Weather */
    private static final Weather[] VALUES = Weather.values();

    /** Private constructor to prevent external instantiation. */
    private WeatherProvider() {}

    /**
     * Returns the unique instance of WeatherProvider.
     *
     * @return the WeatherProvider instance
     */
    public static WeatherProvider getProvider() {
        if (instance == null) {
            instance = new WeatherProvider();
        }
        return instance;
    }

    /**
     * Generates the current weather for a given set of coordinates.
     *
     * @param coordinates the coordinates used to determine the weather
     * @return a string representing the current weather
     */
    public String getCurrentWeather(Coordinates coordinates) {
        if (coordinates == null)
            throw new IllegalArgumentException("Coordinates cannot be null");
            
        int sum = coordinates.sum();
        int index = Math.abs(sum) % VALUES.length;
        return VALUES[index].name();
    }
}
