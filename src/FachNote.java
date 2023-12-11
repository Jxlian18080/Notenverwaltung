import com.sun.jdi.ArrayReference;

import java.util.ArrayList;
import java.util.Random;

public class FachNote extends Note {

    private Unterrichtsfach unterrichtsfach;

    private Random random = new Random();

    FachNote(Unterrichtsfach unterrichtsfach, double wert, ArrayList<Note> unternoten) {
        super(wert, unternoten);
        this.unterrichtsfach = unterrichtsfach;
    }

    FachNote() {

    }

    public ArrayList<FachNote> bestimmeFachnoten(Notensystem notensystem, ArrayList<Unterrichtsfach> fächer) {
        ArrayList<FachNote> fachnoten = new ArrayList<>();
        for(Unterrichtsfach aktuellesUnterrichtsfach: fächer) {
             fachnoten.add(berechneFachnote(notensystem, aktuellesUnterrichtsfach));
        }
        return fachnoten;
    }

    public FachNote berechneFachnote(Notensystem notensystem, Unterrichtsfach aktuellesUnterrichtsfach) {
        Note note = new Note();
        ArrayList<Note> newUnternoten = new ArrayList<>();
        Unterrichtsfach newUnterrichtsfach = aktuellesUnterrichtsfach;
        double durchscnitt = 0;

        for (int i = 0; i < 4 + random.nextInt(3); i++) {
            newUnternoten.add(note.generiereNote(notensystem, i + 1));
        }

        for(Note aktuelleNote : newUnternoten) {
            durchscnitt += aktuelleNote.getWert();
        }


        durchscnitt = durchscnitt / newUnternoten.size();

        return new FachNote(newUnterrichtsfach, durchscnitt, newUnternoten);
    }



    public Unterrichtsfach getUnterrichtsfach() {
        return unterrichtsfach;
    }

    public FachNote setUnterrichtsfach(Unterrichtsfach unterrichtsfach) {
        this.unterrichtsfach = unterrichtsfach;
        return this;
    }
}
