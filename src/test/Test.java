package test;

import main.*;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // testberechneDurchschnitt();
        // testBestimmeNotensystem();
        // testBestimmeFächer();
        // testNotensystem1Bis6();
        // testBestimmeSchüler();
    }

    private static void testberechneDurchschnitt() {
        Schüler schüler = new Schüler();
        ArrayList<FachNote> noten = new ArrayList<>();
        double ergebnis;
        noten.add(new FachNote(null, 3, null));
        noten.add(new FachNote(null, 6, null));
        ergebnis = schüler.berechneNotendurchscnitt(noten);
        System.out.println("Durchschnitt: " + ergebnis);
    }



    private static void testBestimmeNotensystem() {
        Main main = new Main();
        System.out.println(main.bestimmeNotensystem(0).getName());
        System.out.println(main.bestimmeNotensystem(1).getName());
        System.out.println(main.bestimmeNotensystem(2).getName());

        try {
            System.out.println(main.bestimmeNotensystem(3).getName());
        } catch (NullPointerException e) {
            System.out.println("Ungültiger Wert für den Parameter 'randomNumber'");
        }
    }

    private static void testBestimmeFächer() {
        Main main = new Main();
        ArrayList<Unterrichtsfach> fächer = main.bestimmeFächer();
        for (Unterrichtsfach fach : fächer) {
            System.out.println(fach.getName());
        }
    }

    private static void testNotensystem1Bis6() {
        Notensystem1Bis6 notensystem1Bis6 = new Notensystem1Bis6();
        System.out.println("Name: " + notensystem1Bis6.getName());
        System.out.println("Beste Note: " + notensystem1Bis6.getBesteNote());
        System.out.println("Schlechteste Note: " + notensystem1Bis6.getSchlechtesteNote());
        System.out.println("Inkrement: " + notensystem1Bis6.getInkrement());
    }

    private static void testBestimmeSchüler() {
        Main main = new Main();
        Notensystem1Bis6 notensystem1Bis6 = new Notensystem1Bis6();
        ArrayList<Unterrichtsfach> fächer = new ArrayList<>();
        fächer.add(new Unterrichtsfach("Mathe"));
        String vorname = "Rene";
        String nachname = "Robert";
        ArrayList<FachNote> newFachnoten = new ArrayList<>();
        newFachnoten.add(new FachNote(new Unterrichtsfach("name"), 1, null));

        Schüler schüler = main.bestimmeSchüler(notensystem1Bis6, fächer, vorname, nachname, newFachnoten);
        System.out.println("Fächer: " + fächer.get(0).getName());
        System.out.println("Vorname: " + vorname);
        System.out.println("Nachname: " + nachname);
        System.out.println("Fachnote: " + newFachnoten.get(0).getWert());
    }

    // nicht fertig
    private static void testSortStudents() {
        Schüler schüler1 = new Schüler("Anton", "Schneider");
        Schüler schüler2 = new Schüler("Rene", "Zorro");
        ArrayList<Schüler> schüler = new ArrayList<>();
        schüler.add(schüler1);
        schüler.add(schüler2);

    }
}
