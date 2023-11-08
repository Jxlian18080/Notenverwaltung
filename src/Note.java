import java.util.ArrayList;

public class Note {

    private int wert;

    private ArrayList<Unternote> unternote;

    Unterrichtsfach unterrichtsfach;

    Note(Unterrichtsfach unterrichtsfach){
        this.unterrichtsfach = unterrichtsfach;


    }

    public void addUnternote(Unternote unternote) {

    }

    public void removeUnternote(String name) {

    }

    public void noteAusgeben() {

    }

    public int getWert() {
        return wert;
    }

    public void setWert(int wert) {
        this.wert = wert;
    }

    public ArrayList<Unternote> getUnternote() {
        return unternote;
    }

    public void setUnternote(ArrayList<Unternote> unternote) {
        this.unternote = unternote;
    }
}
