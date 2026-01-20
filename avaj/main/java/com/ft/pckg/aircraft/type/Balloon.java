package com.ft.pckg.aircraft.type;

import com.ft.pckg.aircraft.Aircraft;
import com.ft.pckg.utils.Coordinates;
import com.ft.pckg.weather.Weather;

/**
 * Concrete Aircraft implementation representing a Balloon.
 *
 * <p>
 * Defines how a jet reacts to different weather conditions.
 * </p>
 * 
 * <p>
 * Design Pattern used: Observer (Concrete Listener).
 * </p>
 */
public class Balloon extends Aircraft {

    /** Sun increases */
    static final int SUN_LONG_CHANGE = 2;
    static final int SUN_HGT_CHANGE = 4;
    /** Rain increases */
    static final int RAIN_HGT_CHANGE = -5;
    /** Fog increases */
    static final int FOG_HGT_CHANGE = -3;
    /** Snow decreases */
    static final int SNOW_HGT_CHANGE = -15;

    /**
     * Creates a new Balloon instance.
     *
     * @param name        Balloon name
     * @param coordinates initial coordinates
     */
    public Balloon(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    /**
     * Apply weather effects to the Balloon.
     */
    @Override
    protected void applyWeather(Weather weather) {
        switch(weather) {
            case SUN -> {
                coordinates.moveLongPoint(SUN_LONG_CHANGE);
                coordinates.moveHeightPoint(SUN_HGT_CHANGE);
                System.out.println("[" + this + "]: ☀️☀️☀️   🎈   ☀️☀️☀️");
            }
            case RAIN -> {
                coordinates.moveHeightPoint(RAIN_HGT_CHANGE);
                System.out.println("[" + this + "]: 💦💦💦   🎈   💦💦💦");
            }
            case FOG -> {
                coordinates.moveHeightPoint(FOG_HGT_CHANGE);
                System.out.println(this + ": 🌫️🌫️🌫️   🎈   🌫️🌫️🌫️");
            }
            case SNOW -> {
                coordinates.moveHeightPoint(SNOW_HGT_CHANGE);
                System.out.println("[" + this + "]: ❄️❄️❄️   🎈   ❄️❄️❄️");
            }
        }
    }

}
