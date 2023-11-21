import java.util.ArrayList;

public class Note {

    private String name;

    private int wert;

    private ArrayList<Note> unternoten;

    public Note(String name){
        this.name = name;
    }


    public void addUnternote(Note unternote) {
        //todo must be implemented
    }

    public void removeUnternote(String name) {

        //todo must be implemented
    }

    public void noteAusgeben() {

        //todo must be implemented
    }

    public int getWert() {
        return this.wert;
    }

    public void setWert(int wert) {
        this.wert = wert;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

}
