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

    public void erstelleKlasse() {
        String name;
        String userInput;
        boolean validInput = true;
        Notensystem notensystem;

        System.out.println("Geben Sie den Name der Klasse ein");
        userInput = scan.nextLine();

        System.out.println("Welches Notensystem wollen Sie verwenden?\n[1Bis6], [15Bis0], [100Bis0]");

        do {


            name = scan.nextLine().toLowerCase().replace(" ", "");

            switch (userInput) {

                case "1bis6":

                case "15bis0":

                case "100bis0":

                default:
                    System.out.println();

            }
        } while (validInput == false);

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
