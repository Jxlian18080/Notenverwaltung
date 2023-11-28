public abstract class Notensystem {

    private String name;
    private int besteNote;
    private int schlechtesteNote;
    private int inkrement;

    public Notensystem(String name, int besteNote, int schlechtesteNote, int inkrement) {
        this.name = name;
        this.besteNote = besteNote;
        this.schlechtesteNote = schlechtesteNote;
        this.inkrement = inkrement;
    }

     public abstract double toPercent(int note);

}
