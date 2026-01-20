package com.ft.pckg.utils;

/**
 * Represents a Value Object to 3D position of an aircraft.
 *
 * <p>
 * Coordinates are always positive and height is restricted
 * to the range 0-100.
 * </p>
 */
public final class Coordinates {

    public static final int MIN_VALUE = 0;
	public static final int MAX_HEIGHT = 100;

    private int longitude;
    private int latitude;
    private int height;

    private int rangedHeight(int value) {
        return Math.min(Math.max(value, MIN_VALUE), MAX_HEIGHT);
    }

    private int rangedLongLat(int value) {
        return Math.max(value, MIN_VALUE);
    }
    
    /**
     * Creates a new Coordinates instance.
     *
     * @param longitude initial longitude (positive)
     * @param latitude  initial latitude (positive)
     * @param height    initial height (0-100)
     */
    public Coordinates(int p_longitude, int p_latitude, int p_height) {
        this.longitude = rangedLongLat(p_longitude);
        this.latitude = rangedLongLat(p_latitude);
        this.height = rangedHeight(p_height);
    }

    /**
     * Updates the longitude ensuring it remains positive.
     *
     * @param value to be added into current longitude value
     */
    public void moveLongPoint(int value) {
        this.longitude = rangedLongLat(getLongitude() + value);
    }

    /**
     * Updates the latitude ensuring it remains positive.
     *
     * @param value to be added into current latitude value
     */
    public void moveLatPoint(int value) {
        this.latitude = rangedLongLat(getLatitude() + value);
    }

    /**
     * Updates the height ensuring it remains positive.
     *
     * @param value to be added into current height value
     */
    public void moveHeightPoint(int value) {
        this.height = rangedHeight(getHeight() + value);
    }

    /** @return the longitude value */
    public int getLongitude() {
        return longitude;
    }

    /** @return the latitude value */
    public int getLatitude() {
        return latitude;
    }

    /** @return the height value */
    public int getHeight() {
        return height;
    }

    public int sum() {
        return this.longitude + this.latitude + this.height;
    }
}