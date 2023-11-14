public class Unterrichtsfach {

    private String name;

    public Unterrichtsfach(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Unterrichtsfach setName(String name) {
        this.name = name;
        return this;
    }
}
