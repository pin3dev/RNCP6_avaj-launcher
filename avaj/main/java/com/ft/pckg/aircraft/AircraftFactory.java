package com.ft.pckg.aircraft;

import com.ft.pckg.aircraft.type.*;
import com.ft.pckg.utils.Coordinates;

/**
 * Factory class responsible for creating aircraft instances.
 *
 * <p>
 * Design Pattern used: Factory.
 * </p>
 */
public class AircraftFactory {
    /**
     * Creates a new Flyable aircraft based on its type.
     *
     * @param type          aircraft type
     * @param name          aircraft name
     * @param coordinates   aircraft coordinates
     * @return a Flyable aircraft instance
     * @throws IllegalArgumentException if the aircraft type is unknown
     */
    public static Flyable newAircraft(String type, String name, Coordinates coordinates) {
        return switch (type.toUpperCase()) {
            case "HELICOPTER" -> new Helicopter(name, coordinates);
            case "JETPLANE" -> new JetPlane(name, coordinates);
            case "BALLOON" -> new Balloon(name, coordinates);
            default -> throw new IllegalArgumentException("Unknown aircraft type: " + type);
        };
    }
}
