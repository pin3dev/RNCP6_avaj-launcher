package com.ft.pckg.tower;

import com.ft.pckg.aircraft.Flyable;
import java.util.ArrayList;
import java.util.List;

/**
 * Base class representing a Subject in the Observer pattern.
 *
 * <p>
 * Manages registration, unregistration and notification
 * of Flyable (Base Observers/Listeners).
 * </p>
 * 
 * <p>
 * Design Pattern used: Observer (Base Observable/Publisher/Subject).
 * </p>
 */
public class Tower {

    /** List of registered listeners. Still the same */
    private final List<Flyable> observers = new ArrayList<>();

    /** Protected constructor to prevent direct instantiation out of subclass and package. */
    protected Tower() {}

    /**
     * Registers a Flyable observer.
     *
     * @param flyable the observer to register
     */
    public void register(Flyable flyable) {
        if(flyable == null) 
            throw new IllegalArgumentException("Flyable cannot be null.");
        observers.add(flyable);
        System.out.println("[Tower]: " + flyable + " registered to weather tower.");
    }

    /**
     * Unregisters a Flyable listeners.
     *
     * @param flyable the observer to unregister
     */
    public void unregister(Flyable flyable) {
        if(flyable == null) 
            throw new IllegalArgumentException("Flyable cannot be null.");
        observers.remove(flyable);
        System.out.println("[Tower]: " + flyable + " unregistered from weather tower.");
    }

    /**
     * Notifies all registered observers of a weather change.
     *
     * <p>
     * A snapshot is used to avoid ConcurrentModificationException
     * if observers unregister themselves during notification.
     * </p>
     */
    protected void conditionChanged() {
        List<Flyable> snapshot = new ArrayList<>(observers);
        for (Flyable f : snapshot) {
            f.updateConditions();
        }
    }
}
