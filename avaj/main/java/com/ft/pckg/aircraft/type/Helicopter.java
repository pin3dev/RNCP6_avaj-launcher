package com.ft.pckg.aircraft.type;

import com.ft.pckg.aircraft.Aircraft;
import com.ft.pckg.utils.Coordinates;
import com.ft.pckg.weather.Weather;

/**
 * Concrete Aircraft implementation representing a Helicopter.
 *
 * <p>
 * Defines how a helicopter reacts to different weather conditions.
 * </p>
 * 
 * <p>
 * Design Pattern used: Observer (Concrete Listener).
 * </p>
 */
public class Helicopter extends Aircraft {

    /** Sun increases */
    static final int SUN_LONG_CHANGE = 10;
    static final int SUN_HGT_CHANGE = 2;
    /** Rain increases */
    static final int RAIN_LONG_CHANGE = 5;
    /** Fog increases */
    static final int FOG_LONG_CHANGE = 1;
    /** Snow decreases */
    static final int SNOW_HGT_CHANGE = -12;

    /**
     * Creates a new Helicopter instance.
     *
     * @param name        helicopter name
     * @param coordinates initial coordinates
     */
    public Helicopter(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    /**
     * Apply weather effects to the helicopter.
     */
    @Override
    protected void applyWeather(Weather weather) {
        switch(weather) {
            case SUN -> {
                coordinates.moveLongPoint(SUN_LONG_CHANGE);
                coordinates.moveHeightPoint(SUN_HGT_CHANGE);
            }
            case RAIN -> coordinates.moveLongPoint(RAIN_LONG_CHANGE);
            case FOG -> coordinates.moveLongPoint(FOG_LONG_CHANGE);
            case SNOW -> coordinates.moveHeightPoint(SNOW_HGT_CHANGE);
        }
        System.out.println("[ " + this + " ] " + weather.getWeatherMessage() + weather.getWeatherEmoji());
    }

    @Override
    protected String getAircraftEmoji() {
        return "🚁";
    }
}
