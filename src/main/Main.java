package main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    private ArrayList<Schulklasse> schulklassen = new ArrayList<Schulklasse>();

    private Scanner scan = new Scanner(System.in);

    private Random random = new Random();

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {

        Main main = new Main();
        ArrayList<Schulklasse> newSchulklassen = new ArrayList<Schulklasse>();
        Schülernamen schülernamen = new Schülernamen();

        // 2 Klassen werden erzeugt
        for (int i = 0; i < 2; i++) {
            String klassenName = "Klasse " + String.valueOf(1 + main.getSchulklassen().size());
            ArrayList<Unterrichtsfach> fächer = main.bestimmeFächer();
            Notensystem notensystem = main.bestimmeNotensystem(main.random.nextInt(3));

            // Schpler werden erzeugt
            ArrayList<Schüler> schülerListe = new ArrayList<>();

            for(int j = 0; j < 4; j++) {
                String vorname = schülernamen.getVornamen().get(main.random.nextInt(20));
                String nachname = schülernamen.getNachnamen().get(main.random.nextInt(20));
                ArrayList<FachNote> newFachnoten = main.bestimmeFachnoten(notensystem, fächer);
                schülerListe.add(main.bestimmeSchüler(fächer, vorname, nachname, newFachnoten));
            }

            newSchulklassen.add(main.erstelleKlasse(klassenName, fächer, notensystem, schülerListe));
        }
        main.setSchulklassen(newSchulklassen);

        main.ausgabe();
    }

    // Schulklasse wird erstellt
    public Schulklasse erstelleKlasse(String newName, ArrayList<Unterrichtsfach> fächer, Notensystem notensystem, ArrayList<Schüler> schülerListe) {

        return new Schulklasse(newName, fächer, notensystem, schülerListe);

    }

    // Notensystem wird bestimmt basierend auf der Zahl die übergeben wird
    public Notensystem bestimmeNotensystem(int randomNumber) {


        switch (randomNumber) {

            case 0:
                return new Notensystem1Bis6();

            case 1:
                return new Notensystem15Bis0();

            case 2:
                return new Notensystem100Bis0();

        }

        return null;
    }

    // 6 Fächer werden hinzugefügt
    public ArrayList<Unterrichtsfach> bestimmeFächer() {
        ArrayList<Unterrichtsfach> newFächer = new ArrayList<>();

        newFächer.add(new Unterrichtsfach("Mathe"));
        newFächer.add(new Unterrichtsfach("Englisch"));
        newFächer.add(new Unterrichtsfach("Deutsch"));
        newFächer.add(new Unterrichtsfach("Religion"));
        newFächer.add(new Unterrichtsfach("Chemie"));
        newFächer.add(new Unterrichtsfach("Physik"));

        return newFächer;
    }

    // Schüler werden erzeugt
    public Schüler bestimmeSchüler(ArrayList<Unterrichtsfach> fächer, String vorname, String nachname, ArrayList<FachNote> newFachnoten) {

        Schüler schüler = new Schüler();

        Schüler newSchüler = new Schüler(vorname, nachname, fächer, newFachnoten, schüler.berechneNotendurchscnitt(newFachnoten));

        return newSchüler;
    }

    // Fachnoten werden erzeugt
    public ArrayList<FachNote> bestimmeFachnoten(Notensystem notensystem, ArrayList<Unterrichtsfach> fächer) {
        ArrayList<FachNote> fachnoten = new ArrayList<>();

        // Für jedes Unterrichtsfach werden Unternoten erzeugt
        for (Unterrichtsfach aktuellesUnterrichtsfach : fächer) {
            ArrayList<Note> newUnternoten = new ArrayList<>();

            // Unternoten werden generiert
            for (int i = 0; i < 2 + random.nextInt(3); i++) {
                newUnternoten.add(generiereNote(notensystem, i + 1));
            }

            fachnoten.add(berechneFachnote(aktuellesUnterrichtsfach, newUnternoten));
        }
        return fachnoten;
    }

    // Fachnote wird berechnet anhand der Unternoten
    public FachNote berechneFachnote(Unterrichtsfach aktuellesUnterrichtsfach, ArrayList<Note> newUnternoten) {

        Unterrichtsfach newUnterrichtsfach = aktuellesUnterrichtsfach;
        double durchschnitt = 0;

        for (Note aktuelleNote : newUnternoten) {
            durchschnitt += aktuelleNote.getWert();
        }

        durchschnitt = durchschnitt / newUnternoten.size();

        return new FachNote(newUnterrichtsfach, durchschnitt, newUnternoten);
    }

    // Unternote wird erzeugt
    public Note generiereNote(Notensystem notensystem, int numberUnternote) {
        String newName = "unternote" + numberUnternote;
        int newWert;

        // Die Spanne des zu generierenden Wertes wird hier basierend auf dem Notensystem festgelegt
        if (notensystem.getName().equals("1 bis 6")) {
            newWert = 1 + random.nextInt(6);
        } else {
            newWert = random.nextInt(notensystem.getBesteNote() + 1);
        }

        return new Note(newName, newWert, null);
    }

    // Alle erzeugten Werte werden hier ausgegeben
    public void ausgabe() {
        Main main = new Main();
        String tab = "   ";

        // a = der aktuelle Eintrag der Liste 'schulklassen'
        for (int a = 0; a < schulklassen.size(); a++) {
            Schulklasse schulklasse = schulklassen.get(a);
            System.out.println("Name der Klasse: " + schulklasse.getName());
            System.out.println(tab + "Notensystem: " + schulklasse.getNotensystem().getName());

            // b = der aktuelle Eintrag der Liste 'Schüler'
            for (int b = 0; b < schulklassen.get(a).getSchüler().size(); b++) {
                System.out.println(tab + "Schüler: " + schulklassen.get(a).getSchüler().get(b).getVorname() +
                        " " + schulklassen.get(a).getSchüler().get(b).getNachname());

                System.out.println(tab + "Schülerdurchschnitt: " + df.format(schulklassen.get(a).getSchüler().get(b).getNotendurchschnitt()));

                // c = der aktuelle Eintrag der Liste 'Fächer'
                for (int c = 0; c < schulklassen.get(a).getFächer().size(); c++) {
                    System.out.println(tab + tab + "Fach: " + schulklassen.get(a).getFächer().get(c).getName());
                    System.out.println(tab + tab + tab + "Fachnote: " + df.format(schulklassen.get(a).getSchüler().get(b).getFachnoten().get(c).getWert()));

                    // d = der aktuelle Eintrag der Liste 'Unternoten'
                    for (int d = 0; d < schulklassen.get(a).getSchüler().get(b).getFachnoten().get(c).getUnternoten().size(); d++) {
                        System.out.println(tab + tab + tab + tab + "Unternote: " + df.format(schulklassen.get(a).getSchüler().get(b).getFachnoten().get(c).getUnternoten().get(d).getWert()));
                        
                    }
                }
            }
        }
    }

    public ArrayList<Schulklasse> getSchulklassen() {
        return schulklassen;
    }

    public void setSchulklassen(ArrayList<Schulklasse> schulklassen) {
        this.schulklassen = schulklassen;
    }

}
