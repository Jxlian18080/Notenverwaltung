package test;

import main.*;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Test {

    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        // testErstelleKlasse();
        // testBestimmeNotensystem();
        // testBestimmeFächer();
        // testBestimmeSchüler();
        // testBestimmeFachnoten();
        // testBerechneFachnote();
        // testGeneriereNote();
        // testBerechneNotendurchscnitt();
        // testToPercent();

        // testNotensystem1Bis6();

    }




    private static void testErstelleKlasse() {
        Main main = new Main();
        ArrayList<Unterrichtsfach> fächer = new ArrayList<>();
        fächer.add(new Unterrichtsfach("Mathe"));

        ArrayList<Schüler> schüler = new ArrayList<>();
        schüler.add(new Schüler("Rene", "Robert"));

        Schulklasse neueKlasse = main.erstelleKlasse("12FOSI", fächer, new Notensystem1Bis6(), schüler);
        System.out.println("Klassenname: " + neueKlasse.getName());
        System.out.println("Vorname vom Schüler: " + neueKlasse.getSchüler().get(0).getVorname());
        System.out.println("Nachname vom Schüler: " + neueKlasse.getSchüler().get(0).getNachname());
        System.out.println("Name vom Fach: " + neueKlasse.getFächer().get(0).getName());
        System.out.println("Notensystem: " + neueKlasse.getNotensystem().getName());
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

    private static void testBestimmeSchüler() {
        Main main = new Main();
        Notensystem1Bis6 notensystem1Bis6 = new Notensystem1Bis6();
        ArrayList<Unterrichtsfach> fächer = new ArrayList<>();
        fächer.add(new Unterrichtsfach("Mathe"));
        String vorname = "Rene";
        String nachname = "Robert";
        ArrayList<FachNote> newFachnoten = new ArrayList<>();
        newFachnoten.add(new FachNote(new Unterrichtsfach("Mathe"), 1, null));

        Schüler schüler = main.bestimmeSchüler(fächer, vorname, nachname, newFachnoten);

        System.out.println("Fächer: " + schüler.getFächer().get(0).getName());
        System.out.println("Vorname: " + schüler.getVorname());
        System.out.println("Nachname: " + schüler.getNachname());
        System.out.println("Fachnote: " + schüler.getFachnoten().get(0).getWert());
    }

    private static void testBestimmeFachnoten() {
        Main main = new Main();
        ArrayList<Unterrichtsfach> fächer = new ArrayList<>();
        fächer.add(new Unterrichtsfach("Mathe"));
        fächer.add(new Unterrichtsfach("Deutsch"));

        ArrayList<FachNote> fachnoten = main.bestimmeFachnoten(new Notensystem1Bis6(), fächer);

        for (FachNote fachnote : fachnoten) {
            System.out.println("Unterrichtsfach: " + fachnote.getUnterrichtsfach().getName());
            System.out.println("Fachnote: " + df.format(fachnote.getWert()));
            System.out.println();
        }


    }

    private static void testBerechneFachnote() {
        Main main = new Main();
        ArrayList<Note> unternoten = new ArrayList<>();
        unternoten.add(new Note("unternote1", 3, null));
        unternoten.add(new Note("unternote2", 6, null));

        FachNote fachNote = main.berechneFachnote(new Unterrichtsfach("Mathe"), unternoten);

        System.out.println("Fach: " + fachNote.getUnterrichtsfach().getName());
        System.out.println("Wert: " + fachNote.getWert());

        for (Note note : fachNote.getUnternoten()) {
            System.out.println("Wert der Unternote: " + note.getWert());
        }

    }

    private static void testGeneriereNote() {
        Main main = new Main();
        Note note = main.generiereNote(new Notensystem1Bis6(), 1);
        System.out.println("Name der Note: " + note.getName());
        System.out.println("Wert der Note: " + note.getWert());
    }

    private static void testBerechneNotendurchscnitt() {
        Schüler schüler = new Schüler();
        ArrayList<FachNote> noten = new ArrayList<>();
        double ergebnis;
        noten.add(new FachNote(null, 3, null));
        noten.add(new FachNote(null, 6, null));
        ergebnis = schüler.berechneNotendurchscnitt(noten);
        System.out.println("Durchschnitt: " + ergebnis);
    }

    private static void testToPercent() {
        Notensystem1Bis6 notensystem1Bis6 = new Notensystem1Bis6();
        double prozentwert = notensystem1Bis6.toPercent(3);

        System.out.println("Prozentwert: " + prozentwert);
    }


    private static void testNotensystem1Bis6() {
        Notensystem1Bis6 notensystem1Bis6 = new Notensystem1Bis6();
        System.out.println("Name: " + notensystem1Bis6.getName());
        System.out.println("Beste Note: " + notensystem1Bis6.getBesteNote());
        System.out.println("Schlechteste Note: " + notensystem1Bis6.getSchlechtesteNote());
        System.out.println("Inkrement: " + notensystem1Bis6.getInkrement());
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
