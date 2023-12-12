package main;

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




    public Unterrichtsfach getUnterrichtsfach() {
        return unterrichtsfach;
    }

    public FachNote setUnterrichtsfach(Unterrichtsfach unterrichtsfach) {
        this.unterrichtsfach = unterrichtsfach;
        return this;
    }
}
