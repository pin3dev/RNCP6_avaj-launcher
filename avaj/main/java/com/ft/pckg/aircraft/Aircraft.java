package com.ft.pckg.aircraft;

import com.ft.pckg.tower.WeatherTower;
import com.ft.pckg.utils.Coordinates;
import com.ft.pckg.weather.Weather;

/**
 * Abstract base class for all aircraft types.
 *
 * <p>
 * Implements common properties and behaviors shared by
 * all aircraft, including registration to a WeatherTower
 * and landing logic.
 * </p>
 *
 * <p>
 * Design Pattern used: Observer (Abstract Listener).
 * </p>
 */
public abstract class Aircraft implements Flyable {

    /** Unique aircraft identifier */
    protected long id;
    /** Aircraft name */
    protected String name;
    /** Aircraft coordinates */
    protected Coordinates coordinates;
    /** Associated WeatherTower */
    protected WeatherTower weatherTower;
    /** Static counter used to generate unique IDs */
    private static long idCounter = 0;


    /**
     * Returns the emoji representation of the aircraft.
     *
     * @return emoji string
     */
    protected abstract String getAircraftEmoji();


    /**  
     * Weather-specific handlers to be implemented by concrete aircraft types.
     */
    public abstract void onSun();
    public abstract void onRain();
    public abstract void onFog();
    public abstract void onSnow();

    /**
     * Constructs a new Aircraft instance.
     *
     * @param name        aircraft name
     * @param coordinates initial coordinates
     */
    protected Aircraft(String name, Coordinates coordinates) {
        this.id = ++idCounter;
        this.name = name;
        this.coordinates = coordinates;
    }

    /**
     * Registers the aircraft to a WeatherTower (Publisher Observable).
     *
     * @param weatherTower the WeatherTower to register to
     */
    @Override
    public void registerTower(WeatherTower weatherTower) {
        this.weatherTower = weatherTower;
        weatherTower.register(this);

    }

    /**
     * Handles aircraft landing and unregistration from the WeatherTower.
     */
    protected void land() {
        System.out.println("[Aircraft]: " + this + " landing.");
        weatherTower.unregister(this);
    }
    
    @Override
    public final void updateConditions() {
        Weather weather = Weather.valueOf(weatherTower.getWeather(coordinates));
        
        applyWeather(weather);
        if (coordinates.getHeight() <= 0) {
            land();
        }
    }


    /**
     * Applies weather-specific behavior to the aircraft.
     *
     * @param weather the current weather condition
     */
    protected final void applyWeather(Weather weather) {
        weather.apply(this);
        System.out.println("[ " + this + " ] "
            + weather.getWeatherMessage()
            + " "
            + weather.getWeatherEmoji());
    }

    /**
     * Returns a formatted aircraft identifier string.
     *
     * @return formatted aircraft string
     */
    @Override
    public final String toString() {
        return getAircraftEmoji() + " " + getClass().getSimpleName() + "#" + name + "(" + id + ")";
    }
}
