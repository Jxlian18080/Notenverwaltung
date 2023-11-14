import java.util.ArrayList;

public class Schüler {

   private String vorname;
   private String nachname;

   private ArrayList<Unterrichtsfach> fächer;

   private ArrayList<Note> noten;

   public Schüler (String vorname, String nachname){

      this.vorname = vorname;

      this.nachname = nachname;
   }

   public void addNote(Note note){

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

   public ArrayList<Note> getNoten() {
      return noten;
   }

   public Schüler setNoten(ArrayList<Note> noten) {
      this.noten = noten;
      return this;
   }

}
