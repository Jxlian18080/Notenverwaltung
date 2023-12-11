import java.util.ArrayList;

public class Unterrichtsfach {

    private String name;

    public Unterrichtsfach(String name){
        this.name = name;
    }

    public Unterrichtsfach () {

    }

    public ArrayList<Unterrichtsfach> bestimmeFächer() {
        ArrayList<Unterrichtsfach> newFächer = new ArrayList<>();

        newFächer.add(new Unterrichtsfach("Mathe"));
        newFächer.add(new Unterrichtsfach("Englisch"));
        newFächer.add(new Unterrichtsfach("Deutsch"));
        newFächer.add(new Unterrichtsfach("Religion"));
        newFächer.add(new Unterrichtsfach("Chemie"));
        newFächer.add(new Unterrichtsfach("Physik"));

        return newFächer;
    }

    public String getName() {
        return name;
    }

    public Unterrichtsfach setName(String name) {
        this.name = name;
        return this;
    }
}
