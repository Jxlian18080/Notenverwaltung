import java.util.ArrayList;

public class FachNote extends Note{

    Unterrichtsfach unterrichtsfach;

    FachNote(Unterrichtsfach unterrichtsfach, String name){
        super(name);
        this.unterrichtsfach = unterrichtsfach;
    }

    public Unterrichtsfach getUnterrichtsfach() {
        return unterrichtsfach;
    }

    public FachNote setUnterrichtsfach(Unterrichtsfach unterrichtsfach) {
        this.unterrichtsfach = unterrichtsfach;
        return this;
    }
}
