import java.util.ArrayList;
import java.util.Random;

public class Schüler {

   private String vorname;
   private String nachname;

   private ArrayList<Unterrichtsfach> fächer;

   private ArrayList<FachNote> fachnoten;

   Random random = new Random();

   public Schüler (String vorname, String nachname, ArrayList<FachNote> fachnoten){

      this.vorname = vorname;
      this.nachname = nachname;
      this.fachnoten = fachnoten;
   }

   public Schüler() {

   }

   public Schüler bestimmeSchüler(Notensystem notensystem, ArrayList<Unterrichtsfach> fächer) {
      Schülernamen schülernamen = new Schülernamen();
      FachNote fachNote = new FachNote();
      String vorname = schülernamen.getVornamen().get(random.nextInt(20));
      String nachname = schülernamen.getNachnamen().get(random.nextInt(20));

      Schüler newSchüler = new Schüler(vorname, nachname, fachNote.bestimmeFachnoten(notensystem, fächer));

      return newSchüler;
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

}
