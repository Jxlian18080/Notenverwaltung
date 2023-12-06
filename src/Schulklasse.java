import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Schulklasse {

    private String name;

    private ArrayList<Unterrichtsfach> fächer;

    private ArrayList<Schüler> schüler;

    Notensystem notensystem;



    public Schulklasse(String name, ArrayList<Unterrichtsfach> fächer, Notensystem notensystem, ArrayList<Schüler> schüler) {

        this.name = name;
        this.notensystem = notensystem;
    }

    public Schulklasse() {

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
