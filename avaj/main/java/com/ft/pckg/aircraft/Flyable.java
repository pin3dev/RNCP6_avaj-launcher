package com.ft.pckg.aircraft;

import com.ft.pckg.tower.WeatherTower;


/**
 * Interface representing an observer/listener rule in the weather simulation.
 *
 * <p>
 * Any class implementing Flyable can register itself to a WeatherTower
 * and will be notified whenever weather conditions change.
 * </p>
 *
 * <p>
 * Design Pattern used: Observer (Rules for Observer/Listeners).
 * </p>
 */
public interface Flyable {

    /**
     * Called by the WeatherTower when weather conditions change.
     */
    void updateConditions();

    /**
     * Registers the aircraft to a WeatherTower.
     *
     * @param p_Tower the WeatherTower to register to
     */
    void registerTower(WeatherTower p_Tower);
}