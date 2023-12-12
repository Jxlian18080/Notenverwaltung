package main;

import java.util.ArrayList;

public class Schulklasse {

    private String name;

    private ArrayList<Unterrichtsfach> fächer;

    private ArrayList<Schüler> schüler;

    private Notensystem notensystem;


    public Schulklasse(String name, ArrayList<Unterrichtsfach> fächer, Notensystem notensystem, ArrayList<Schüler> schüler) {
        this.name = name;
        this.notensystem = notensystem;
        this.fächer = fächer;
        this.schüler = schüler;
    }

    public Schulklasse(String name, Notensystem notensystem) {
        this.name = name;
        this.notensystem = notensystem;
    }

    public Schulklasse() {

    }


    public void getStudentSortedByLastName(ArrayList<Schüler> schüler) {
        // geht nicht
        // Collections.sort(schüler);
    }

    public void ausgebenDurchschnittsnote() {

    }

    public String getName() {
        return name;
    }

    public Schulklasse setName(String name) {
        this.name = name;
        return this;
    }

    public ArrayList<Unterrichtsfach> getFächer() {
        return fächer;
    }

    public Schulklasse setFächer(ArrayList<Unterrichtsfach> fächer) {
        this.fächer = fächer;
        return this;
    }

    public ArrayList<Schüler> getSchüler() {
        return schüler;
    }

    public Schulklasse setSchüler(ArrayList<Schüler> schüler) {
        this.schüler = schüler;
        return this;
    }

    public Notensystem getNotensystem() {
        return notensystem;
    }

    public Schulklasse setNotensystem(Notensystem notensystem) {
        this.notensystem = notensystem;
        return this;
    }
}
