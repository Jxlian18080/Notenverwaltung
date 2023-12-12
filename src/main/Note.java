package main;

import java.util.ArrayList;
import java.util.Random;

public class Note {

    private String name;

    private double wert;

    private ArrayList<Note> unternoten;

    private Random random = new Random();

    public Note(String name, double wert,  ArrayList<Note> unternoten){
        this.name = name;
        this.wert = wert;
        this.unternoten = unternoten;
    }

    public Note(double wert,  ArrayList<Note> unternoten){
        this.wert = wert;
        this.unternoten = unternoten;
    }

    public Note () {

    }



    public void addUnternote(Note unternote) {


    }

    public void removeUnternote(String name) {

        //todo must be implemented
    }

    public void noteAusgeben() {

        //todo must be implemented
    }

    public ArrayList<Note> getUnternoten() {
        return unternoten;
    }

    public void setUnternoten(ArrayList<Note> unternoten) {
        this.unternoten = unternoten;
    }

    public double getWert() {
        return this.wert;
    }

    public void setWert(double wert) {
        this.wert = wert;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

}
