import java.util.ArrayList;

public class Unternote {
    private String name;
    private int wert;

    private ArrayList<Note> unternote;

    public Unternote(String name){
        this.name = name;

    }

    public void addUnternote(Unternote unternote){

    }

    public void removeUnternote(String name){

    }

    public String getName() {
        return name;
    }

    public Unternote setName(String name) {
        this.name = name;
        return this;
    }

    public int getWert() {
        return wert;
    }

    public Unternote setWert(int wert) {
        this.wert = wert;
        return this;
    }

    public ArrayList<Note> getUnternote() {
        return unternote;
    }

    public Unternote setUnternote(ArrayList<Note> unternote) {
        this.unternote = unternote;
        return this;
    }
}
