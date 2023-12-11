import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Schulklasse {

    private String name;

    private ArrayList<Unterrichtsfach> fächer;

    private ArrayList<Schüler> schüler;

    private Notensystem notensystem;

    private Random random = new Random();


    public Schulklasse(String name, ArrayList<Unterrichtsfach> fächer, Notensystem notensystem, ArrayList<Schüler> schüler) {
        this.name = name;
        this.notensystem = notensystem;
        this.fächer = fächer;
        this.schüler = schüler;
    }

    public Schulklasse() {

    }

    public ArrayList<Schulklasse> erstelleKlasse(ArrayList<Schulklasse> schulklassen) {

        Main main = new Main();
        Unterrichtsfach unterrichtsfach = new Unterrichtsfach();
        Schüler schüler = new Schüler();
        ArrayList<Schüler> schülerListe = new ArrayList<>();

        String newName = "Klasse " + String.valueOf(1 + schulklassen.size());

        Notensystem notensystem = bestimmeNotensystem();

        ArrayList<Unterrichtsfach> fächer = unterrichtsfach.bestimmeFächer();

        for(int i = 0; i < 4; i++) {
            schülerListe.add(schüler.bestimmeSchüler(notensystem, fächer));
        }

        schulklassen.add(new Schulklasse(newName, fächer, notensystem, schülerListe));

        return schulklassen;

    }

    private Notensystem bestimmeNotensystem() {


        switch (random.nextInt(3)) {

            case 0:
                return new Notensystem1Bis6();

            case 1:
                return new Notensystem15Bis0();

            case 2:
                return new Notensystem100Bis0();

        }

        return null;
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
