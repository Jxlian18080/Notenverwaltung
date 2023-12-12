package main;

import java.util.ArrayList;
import java.util.Arrays;

public class Schülernamen {

    private ArrayList<String> vornamen = new ArrayList<>(Arrays.asList("Emilia", "Sophia", "Emma", "Mia", "Hannah",
            "Lina", "Mila", "Ella", "Klara", "Marie", "Noah", "Matteo", "Leon", "Finn", "Paul", "Elias", "Emil", "Luca",
            "Louis", "Henry"));
    private ArrayList<String> nachnamen = new ArrayList<>(Arrays.asList("Müller", "Schmidt", "Schneider", "Fischer",
            "Weber", "Meyer", "Wagner", "Schulz", "Becker", "Hoffmann", "Schäfer", "Koch", "Richter", "Bauer", "Klein",
            "Wolf", "Schröder", "Neumann", "Schwarz", "Zimmermann"));


    public ArrayList<String> getVornamen() {
        return vornamen;
    }

    public ArrayList<String> getNachnamen() {
        return nachnamen;
    }
}
