package com.ft.pckg.weather;

/**
 * Enumeration representing all possible weather conditions
 * in the simulation.
 *
 * <p>
 * Each weather type affects aircraft movement differently,
 * depending on the concrete aircraft implementation.
 * </p>
 */
public enum Weather {
    SUN,
    RAIN,
    FOG,
    SNOW
}
