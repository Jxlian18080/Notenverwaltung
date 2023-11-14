import java.util.ArrayList;

public class Schulklasse {

   private String name;

   private ArrayList<Unterrichtsfach> fächer;

   private ArrayList<Schüler> schüler;

   Notensystem notensystem;

   public Schulklasse (String name, Notensystem notensystem){

      this.name = name;

      this.notensystem = notensystem;
   }

   public void ausgebenDurchschnittnote(){

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
