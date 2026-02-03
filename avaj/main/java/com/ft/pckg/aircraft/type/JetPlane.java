package com.ft.pckg.aircraft.type;

import com.ft.pckg.aircraft.Aircraft;
import com.ft.pckg.utils.Coordinates;

/**
 * Concrete Aircraft implementation representing a JetPlane.
 *
 * <p>
 * Defines how a jet reacts to different weather conditions.
 * </p>
 * 
 * <p>
 * Design Pattern used: Observer (Concrete Listener).
 * </p>
 */
public class JetPlane extends Aircraft {

    /** Sun increases */
    static final int SUN_LAT_CHANGE = 10;
    static final int SUN_HGT_CHANGE = 2;
    /** Rain increases */
    static final int RAIN_LAT_CHANGE = 5;
    /** Fog increases */
    static final int FOG_LAT_CHANGE = 1;
    /** Snow decreases */
    static final int SNOW_HGT_CHANGE = -7;

    /**
     * Creates a new JetPlane instance.
     *
     * @param name        jet name
     * @param coordinates initial coordinates
     */
    public JetPlane(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    /**  
     * Weather-specific handlers to be implemented to the jetplane.
     */
    @Override
    public void onSun() {
        coordinates.moveLatPoint(SUN_LAT_CHANGE);
        coordinates.moveHeightPoint(SUN_HGT_CHANGE);
    }

    @Override
    public void onRain() {
        coordinates.moveLatPoint(RAIN_LAT_CHANGE);
    }

    @Override
    public void onFog() {
        coordinates.moveLatPoint(FOG_LAT_CHANGE);
    }

    @Override
    public void onSnow() {
        coordinates.moveHeightPoint(SNOW_HGT_CHANGE);
    }


    /**
     * Returns the emoji representation of the jetplane.
     */
    // @Override
    // protected String getAircraftEmoji() {
    //     return "✈️ ";
    // }
}
