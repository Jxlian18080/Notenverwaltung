package main;

import java.util.ArrayList;
import java.util.Random;

public class Schüler {

   private String vorname;
   private String nachname;

   private ArrayList<Unterrichtsfach> fächer;

   private ArrayList<FachNote> fachnoten;

   private double notendurchschnitt;

   Random random = new Random();

   public Schüler (String vorname, String nachname,  ArrayList<Unterrichtsfach> fächer, ArrayList<FachNote> fachnoten, double notendurchschnitt){

      this.vorname = vorname;
      this.nachname = nachname;
      this.fächer = fächer;
      this.fachnoten = fachnoten;
      this.notendurchschnitt = notendurchschnitt;
   }

   public Schüler (String vorname, String nachname) {
      this.vorname = vorname;
      this.nachname = nachname;
   }

   public Schüler() {

   }

   // Notendurchschnitt wird berechnet
   public double berechneNotendurchscnitt(ArrayList<FachNote> newFachnoten) {
      double newNotendurchschnitt = 0;

      for(FachNote fachNote : newFachnoten) {
         newNotendurchschnitt += fachNote.getWert();
      }

      return newNotendurchschnitt / newFachnoten.size();
   }

   public void addNote(FachNote note){

   }
   public void removeNote(Unterrichtsfach unterrichtsfach){

   }
   public void addUnterrichtsfach(Unterrichtsfach unterrichtsfach){

   }
   public void addUnterrichtsfächer(ArrayList<Unterrichtsfach> unterrichtsfächer){

   }

   public String getVorname() {
      return vorname;
   }

   public Schüler setVorname(String vorname) {
      this.vorname = vorname;
      return this;
   }

   public String getNachname() {
      return nachname;
   }

   public Schüler setNachname(String nachname) {
      this.nachname = nachname;
      return this;
   }

   public ArrayList<Unterrichtsfach> getFächer() {
      return fächer;
   }

   public Schüler setFächer(ArrayList<Unterrichtsfach> fächer) {
      this.fächer = fächer;
      return this;
   }

   public ArrayList<FachNote> getFachnoten() {
      return fachnoten;
   }

   public Schüler setFachnoten(ArrayList<FachNote> fachnoten) {
      this.fachnoten = fachnoten;
      return this;
   }

   public double getNotendurchschnitt() {
      return notendurchschnitt;
   }

}
