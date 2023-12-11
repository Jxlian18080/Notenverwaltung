import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    private ArrayList<Schulklasse> schulklassen = new ArrayList<Schulklasse>();

    Scanner scan = new Scanner(System.in);

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {

        Main main = new Main();
        Schulklasse schulklasse = new Schulklasse();
        for (int i = 0; i < 2; i++) {
            main.setSchulklassen(schulklasse.erstelleKlasse(main.getSchulklassen()));
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(main.getSchulklassen().get(0).getSchüler().get(i).getVorname() + " "
                    + main.getSchulklassen().get(0).getSchüler().get(i).getNachname());
        }
        main.ausgabe();
    }

    public void ausgabe() {
        Main main = new Main();
        String tab = "   ";
        for (int a = 0; a < schulklassen.size(); a++) {
            Schulklasse schulklasse = schulklassen.get(a);
            System.out.println("Name der Klasse: " + schulklasse.getName());
            System.out.println(tab + "Notensystem: " + schulklasse.getNotensystem().getName());

            for (int b = 0; b < schulklassen.get(a).getSchüler().size(); b++) {
                System.out.println(tab + "Schüler: " + schulklassen.get(a).getSchüler().get(b).getVorname() +
                        " " + schulklassen.get(a).getSchüler().get(b).getNachname());

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
