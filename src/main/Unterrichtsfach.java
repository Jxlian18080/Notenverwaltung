package main;

public class Unterrichtsfach {

    private String name;

    public Unterrichtsfach(String name){
        this.name = name;
    }

    public Unterrichtsfach () {

    }


    public String getName() {
        return name;
    }

    public Unterrichtsfach setName(String name) {
        this.name = name;
        return this;
    }
}
