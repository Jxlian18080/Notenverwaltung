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
        for (int i = 0; i < 2; i++) {
            main.erstelleKlasse();
        }

        main.ausgabe();
    }

    public ArrayList<Schulklasse> erstelleKlasse() {

        Main main = new Main();
        Unterrichtsfach unterrichtsfach = new Unterrichtsfach();
        Schüler schüler = new Schüler();
        ArrayList<Schüler> schülerListe = new ArrayList<>();

        String newName = "Klasse " + String.valueOf(1 + schulklassen.size());

        Notensystem notensystem = bestimmeNotensystem();

        ArrayList<Unterrichtsfach> fächer = bestimmeFächer();

        for(int i = 0; i < 4; i++) {
            schülerListe.add(bestimmeSchüler(notensystem, fächer));
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

    private ArrayList<Unterrichtsfach> bestimmeFächer() {
        ArrayList<Unterrichtsfach> newFächer = new ArrayList<>();

        newFächer.add(new Unterrichtsfach("Mathe"));
        newFächer.add(new Unterrichtsfach("Englisch"));
        newFächer.add(new Unterrichtsfach("Deutsch"));
        newFächer.add(new Unterrichtsfach("Religion"));
        newFächer.add(new Unterrichtsfach("Chemie"));
        newFächer.add(new Unterrichtsfach("Physik"));

        return newFächer;
    }

    private Schüler bestimmeSchüler(Notensystem notensystem, ArrayList<Unterrichtsfach> fächer) {
        Schülernamen schülernamen = new Schülernamen();
        Schüler schüler = new Schüler();
        String vorname = schülernamen.getVornamen().get(random.nextInt(20));
        String nachname = schülernamen.getNachnamen().get(random.nextInt(20));
        ArrayList<FachNote> newFachnoten = bestimmeFachnoten(notensystem, fächer);

        Schüler newSchüler = new Schüler(vorname, nachname, newFachnoten, schüler.berechneNotendurchscnitt(newFachnoten));

        return newSchüler;
    }

    public ArrayList<FachNote> bestimmeFachnoten(Notensystem notensystem, ArrayList<Unterrichtsfach> fächer) {
        ArrayList<FachNote> fachnoten = new ArrayList<>();
        for (Unterrichtsfach aktuellesUnterrichtsfach : fächer) {
            fachnoten.add(berechneFachnote(notensystem, aktuellesUnterrichtsfach));
        }
        return fachnoten;
    }

    public FachNote berechneFachnote(Notensystem notensystem, Unterrichtsfach aktuellesUnterrichtsfach) {
        Note note = new Note();
        ArrayList<Note> newUnternoten = new ArrayList<>();
        Unterrichtsfach newUnterrichtsfach = aktuellesUnterrichtsfach;
        double durchscnitt = 0;


        for (int i = 0; i < 2 + random.nextInt(3); i++) {
            newUnternoten.add(generiereNote(notensystem, i + 1));
        }


        for (Note aktuelleNote : newUnternoten) {
            durchscnitt += aktuelleNote.getWert();
        }


        durchscnitt = durchscnitt / newUnternoten.size();

        return new FachNote(newUnterrichtsfach, durchscnitt, newUnternoten);
    }

    public Note generiereNote(Notensystem notensystem, int numberUnternote) {
        String newName = "unternote" + numberUnternote;
        int newWert;

        if (notensystem.getName().equals("1 bis 6")) {
            newWert = 1 + random.nextInt(6);
        } else {
            newWert = random.nextInt(notensystem.getBesteNote() + 1);
        }

        return new Note(newName, newWert, null);
    }


    public void ausgabe() {
        Main main = new Main();
        String tab = "   ";
        for (int a = 0; a < schulklassen.size(); a++) {
            Schulklasse schulklasse = schulklassen.get(a);
            System.out.println("Name der Klasse: " + schulklasse.getName());
            System.out.println(tab + "main.Notensystem: " + schulklasse.getNotensystem().getName());

            for (int b = 0; b < schulklassen.get(a).getSchüler().size(); b++) {
                System.out.println(tab + "main.Schüler: " + schulklassen.get(a).getSchüler().get(b).getVorname() +
                        " " + schulklassen.get(a).getSchüler().get(b).getNachname());

                System.out.println(tab + "Schülerdurchschnitt: " + df.format(schulklassen.get(a).getSchüler().get(b).getNotendurchschnitt()));

                for (int c = 0; c < schulklassen.get(a).getFächer().size(); c++) {
                    System.out.println(tab + tab + "Fach: " + schulklassen.get(a).getFächer().get(c).getName());
                    System.out.println(tab + tab + tab + "Fachnote: " + df.format(schulklassen.get(a).getSchüler().get(b).getFachnoten().get(0).getWert()));

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
