package com.ft.pckg.aircraft.type;

import com.ft.pckg.aircraft.Aircraft;
import com.ft.pckg.utils.Coordinates;

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
     * Weather-specific handlers to be implemented to the helicopter.
     */
    @Override
    public void onSun() {
        coordinates.moveLongPoint(SUN_LONG_CHANGE);
        coordinates.moveHeightPoint(SUN_HGT_CHANGE);
    }

    @Override
    public void onRain() {
        coordinates.moveLongPoint(RAIN_LONG_CHANGE);
    }

    @Override
    public void onFog() {
        coordinates.moveLongPoint(FOG_LONG_CHANGE);
    }

    @Override
    public void onSnow() {
        coordinates.moveHeightPoint(SNOW_HGT_CHANGE);
    }


    /**
     * Returns the emoji representation of the helicopter.
     */
    @Override
    protected String getAircraftEmoji() {
        return "🚁";
    }
}
