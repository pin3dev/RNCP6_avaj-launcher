package com.ft.pckg.weather;

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
 * </p>
 */
public enum Weather {
    SUN("☀️", "This is hot."),
    RAIN("🌧️", "Damn you rain!"),
    FOG("🌫️", "Can't see anything."),
    SNOW("❄️", "Winter is coming!");

    private final String emoji;
    private final String message;

    Weather(String emoji, String message) {
        this.emoji = emoji;
        this.message = message;
    }

    public String getWeatherEmoji() {
        return emoji;
    }

    public String getWeatherMessage() {
        return message;
    }
}
