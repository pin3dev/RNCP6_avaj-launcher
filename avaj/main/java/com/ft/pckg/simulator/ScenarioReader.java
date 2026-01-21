package com.ft.pckg.simulator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * Reads and parses the scenario file.
 * The first line contains the number of simulations to run.
 * Each subsequent line contains aircraft data in the format:
 *                      <TYPE NAME LONGITUDE LATITUDE HEIGHT>
 * - TYPE is the aircraft type (e.g., "Helicopter"),
 * - NAME is the aircraft name,
 * - LONGITUDE, LATITUDE, and HEIGHT are integers representing the aircraft's coordinates.
 */
public class ScenarioReader {

    /** Separator used in the aircraft info lines */
    public static String FILE_AIRCRAFTINFO_SEPARATOR = "\\s+";
    /** Number of expected columns in the aircraft info lines */
    public static int FILE_AIRCRAFTINFO_COLUMNS = 5;


    /**
     * Represents a simulation scenario.
     * Includes the number of simulations and a list of aircraft data.
     */
    public static class Scenario {
        
        public final int simulations;
        public final List<String[]> aircraftData;

        public Scenario(int simulations, List<String[]> aircraftData) {
            this.simulations = simulations;
            this.aircraftData = aircraftData;
        }
    }

    /**
     * Reads and parses the scenario file.
     * @param file the path to the scenario file
     * @return a Scenario object containing the number of simulations and aircraft data
     * @throws java.io.FileNotFoundException if the file is not found
     * @throws java.io.IOException if an I/O error occurs
     */
    public Scenario read(String file) throws FileNotFoundException, IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            int simulations = Integer.parseInt(br.readLine().trim());
            if (simulations <= 0) {
                throw new IllegalArgumentException("Invalid simulation count");
            }

            List<String[]> aircrafts = new ArrayList<>();
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(FILE_AIRCRAFTINFO_SEPARATOR);
                if (parts.length != FILE_AIRCRAFTINFO_COLUMNS) {
                    throw new IllegalArgumentException("Invalid format of line: " + line);
                }
                aircrafts.add(parts);
            }
            return new Scenario(simulations, aircrafts);
        }
    }
}
