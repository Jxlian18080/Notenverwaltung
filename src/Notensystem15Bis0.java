public class Notensystem15Bis0 extends Notensystem {

    Notensystem15Bis0() {
        super("0 bis 15", 15, 0, 1);
    }

    @Override
    public double toPercent(int note) {
        if (note == 0) {
            return 10;
        } else if (note == 1) {
            return 23.5;
        } else if (note == 2) {
            return 30;
        } else if (note == 3){
            return 37.5;
        } else if (note == 4){
            return 42.5;
        }

    }
}
