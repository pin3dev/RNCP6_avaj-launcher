package com.ft.pckg.weather;

import com.ft.pckg.aircraft.Aircraft;

/**
 * Enumeration representing all possible weather conditions
 * in the simulation.
 *
 * <p>
 * Each weather type affects aircraft movement differently,
 * depending on the concrete aircraft implementation.
 * 
 * Each weather type is associated with an emoji and a message
 * that describes the weather condition.
 * 
 * Design Pattern used: Strategy.
 * </p>
 */
public enum Weather {
    /** Sunny weather condition */
    SUN("☀️", "This is hot.") {
        @Override
        public void apply(Aircraft a) {
            a.onSun();
        }
    },
    /** Rainy weather condition */
    RAIN("🌧️", "Damn you rain!") {
        @Override
        public void apply(Aircraft a) {
            a.onRain();
        }
    },
    /** Foggy weather condition */
    FOG("🌫️", "Can't see anything.") {
        @Override
        public void apply(Aircraft a) {
            a.onFog();
        }
    },
    /** Snowy weather condition */
    SNOW("❄️", "Winter is coming!") {
        @Override
        public void apply(Aircraft a) {
            a.onSnow();
        }
    };

    /** Emoji representing the weather type */
    private final String emoji;
    /** Descriptive message for the weather type */
    private final String message;

    /** 
     * Constructor to initialize weather type with emoji and message.
     *
     * @param emoji   emoji representing the weather
     * @param message descriptive message for the weather
     */
    Weather(String emoji, String message) {
        this.emoji = emoji;
        this.message = message;
    }

    /**
     * Applies the weather effect to the given aircraft.
     *
     * @param aircraft the aircraft to apply the weather effect to
     */
    public abstract void apply(Aircraft aircraft);

    /**
     * Returns the emoji associated with the weather type.
     *
     * @return weather emoji
     */
    public String getWeatherEmoji() {
        return emoji;
    }

    /**
     * Returns the message associated with the weather type.
     *
     * @return weather message
     */
    public String getWeatherMessage() {
        return message;
    }
}
