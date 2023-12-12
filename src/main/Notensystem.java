package main;

import java.util.Random;

public abstract class Notensystem {

    private String name;
    private int besteNote;
    private int schlechtesteNote;
    private int inkrement;

    Random random = new Random();

    public Notensystem(String name, int besteNote, int schlechtesteNote, int inkrement) {
        this.name = name;
        this.besteNote = besteNote;
        this.schlechtesteNote = schlechtesteNote;
        this.inkrement = inkrement;
    }

     public abstract double toPercent(int note);

    public String getName() {
        return name;
    }

    public int getBesteNote() {
        return besteNote;
    }

    public int getSchlechtesteNote() {
        return schlechtesteNote;
    }

}
