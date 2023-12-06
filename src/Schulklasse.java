import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Schulklasse {

    private String name;

    private ArrayList<Unterrichtsfach> fächer;

    private ArrayList<Schüler> schüler;

    Notensystem notensystem;

    Scanner scan = new Scanner(System.in);

    public Schulklasse(String name, Notensystem notensystem) {

        this.name = name;
        this.notensystem = notensystem;
    }

    public Schulklasse() {

    }

    public void erstelleKlasse() {

        System.out.println("Geben Sie den Name der Klasse ein");
        name = scan.nextLine();

        notensystem = bestimmeNotensystem();

        fächer = bestimmeFächer();

        schüler = bestimmeSchüler();

    }

    private Notensystem bestimmeNotensystem() {
        String userInput;

        System.out.println("Welches Notensystem wollen Sie verwenden?\n[1Bis6], [15Bis0], [100Bis0]");

        do {

            userInput = scan.nextLine().toLowerCase().replace(" ", "");

            switch (userInput) {

                case "1bis6":
                    return new Notensystem1Bis6();

                case "15bis0":
                    return new Notensystem15Bis0();

                case "100bis0":
                    return new Notensystem100Bis0();

                default:
                    System.out.println("Dieses Notensystem existiert nicht!");
                    System.out.println("Bitte geben Sie '1Bis6', '15Bis0' oder '100Bis0' ein");

            }
        } while (1 < 2);
    }

    private ArrayList<Unterrichtsfach> bestimmeFächer() {
        ArrayList<Unterrichtsfach> newFächer = new ArrayList<>();
        String userInput;
        boolean doAnotherIteration;

        System.out.println("Geben Sie ein Fach ein, dass Sie hinzufügen wollen");

        userInput = scan.nextLine();
        newFächer.add(new Unterrichtsfach(userInput));
        System.out.println(userInput + " wurde hinzugefügt");

        do {

            doAnotherIteration = false;

            System.out.println("Wollen Sie noch ein weiteres Fach hinzufügen?\nGeben Sie 'y' für yes oder 'n' für no ein");
            userInput = scan.nextLine().replace(" ", "");

            while (!(userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("n"))) {
                System.out.println("Bitte geben Sie 'y' für yes oder 'n' für no ein");
                userInput = scan.nextLine();
            }

            if (userInput.equalsIgnoreCase("y")) {
                System.out.println("Geben Sie ein Fach ein, dass Sie hinzufügen wollen");
                userInput = scan.nextLine();
                newFächer.add(new Unterrichtsfach(userInput));
                System.out.println(userInput + " wurde hinzugefügt");
                doAnotherIteration = true;
            }

        } while(doAnotherIteration == true);

        return newFächer;
    }

    private ArrayList<Schüler> bestimmeSchüler() {
        ArrayList<Schüler> newSchüler = new ArrayList<>();
        String userInput;
        String vorname;
        String nachname;
        boolean doAnotherIteration;

        System.out.println("Geben Sie den Vornamen des Schülers ein, den Sie hinzufügen wollen");

        vorname = scan.nextLine();

        System.out.println("Geben Sie den Nachnamen des Schülers ein, den Sie hinzufügen wollen");

        nachname = scan.nextLine();

        newSchüler.add(new Schüler(vorname, nachname));
        System.out.println(vorname + " " + nachname + " wurde hinzugefügt");

        do {

            doAnotherIteration = false;

            System.out.println("Wollen Sie noch einen weiteren Schüler hinzufügen?");
            System.out.println("Geben Sie 'y' für yes oder 'n' für no ein");
            userInput = scan.nextLine().replace(" ", "");

            while (!(userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("n"))) {
                System.out.println("Bitte geben Sie 'y' für yes oder 'n' für no ein");
                userInput = scan.nextLine();
            }

            if (userInput.equalsIgnoreCase("y")) {
                System.out.println("Geben Sie den Vornamen des Schülers ein, den Sie hinzufügen wollen");
                vorname = scan.nextLine();

                System.out.println("Geben Sie den Nachnamen des Schülers ein, den Sie hinzufügen wollen");
                nachname = scan.nextLine();

                newSchüler.add(new Schüler(vorname, nachname));
                System.out.println(vorname + " " + nachname + " wurde hinzugefügt");
                doAnotherIteration = true;
            }

        } while(doAnotherIteration == true);

        return newSchüler;
    }

    public void ausgebenDurchschnittnote() {

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
