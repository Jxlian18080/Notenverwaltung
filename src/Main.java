import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private ArrayList<Schulklasse> schulklassen = new ArrayList<Schulklasse>();

    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        Main main = new Main();
        Schulklasse schulklasse = new Schulklasse();
        main.erstelleKlasse();

    }

    private void erstelleKlasse() {

        System.out.println("Geben Sie den Name der Klasse ein");
        String name = scan.nextLine();

        Notensystem notensystem = bestimmeNotensystem();

        ArrayList<Unterrichtsfach> fächer = bestimmeFächer();

        ArrayList<Schüler> schüler = bestimmeSchüler();

        schulklassen.add(new Schulklasse(name, fächer, notensystem, schüler));

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

        } while (doAnotherIteration == true);

        return newFächer;
    }

    private ArrayList<Schüler> bestimmeSchüler() {
        ArrayList<Schüler> newSchüler = new ArrayList<>();
        String userInput;

        boolean doAnotherIteration;

        newSchüler = abfrageName(newSchüler);

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
                newSchüler = abfrageName(newSchüler);
                doAnotherIteration = true;
            }

        } while (doAnotherIteration == true);

        return newSchüler;
    }

    private ArrayList<Schüler> abfrageName(ArrayList<Schüler> newSchüler) {
        String vorname;
        String nachname;

        System.out.println("Geben Sie den Vornamen des Schülers ein, den Sie hinzufügen wollen");

        vorname = scan.nextLine();

        System.out.println("Geben Sie den Nachnamen des Schülers ein, den Sie hinzufügen wollen");

        nachname = scan.nextLine();

        newSchüler.add(new Schüler(vorname, nachname));
        System.out.println(vorname + " " + nachname + " wurde hinzugefügt");

        return newSchüler;
    }

    private void addNote () {

        Schulklasse schulklasse = new Schulklasse();



        System.out.println("Geben Sie die Klasse ein von dem Sie die Note hinzufügen wollen");
        if (schulklassen.contains(scan.nextLine().replace(" ", ""))) {



        }

        System.out.println("Geben Sie den Vornamen des Schülers ein von dem Sie die Note hinzufügen wollen");
        if (scan.nextLine().replace(" ", "").equalsIgnoreCase(schulklasse.getName())) {


        }





    }

    public ArrayList<Schulklasse> getSchulklassen() {
        return schulklassen;
    }

    public void setSchulklassen(ArrayList<Schulklasse> schulklassen) {
        this.schulklassen = schulklassen;
    }

}
