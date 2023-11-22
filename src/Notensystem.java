public abstract class Notensystem {

    private String name;
    private int besteNote;//1
    private int schlechtesteNote;//6
    private int inkrement;//1

    public Notensystem(String name, int besteNote, int schlechtesteNote, int inkrement) {
        this.name = name;
        this.besteNote = besteNote;
        this.schlechtesteNote = schlechtesteNote;
        this.inkrement = inkrement;
    }

     public abstract double toPercent(int note);

}
