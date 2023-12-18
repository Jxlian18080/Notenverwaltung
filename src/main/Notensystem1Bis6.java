package main;

public class Notensystem1Bis6 extends Notensystem {

    public Notensystem1Bis6() {
        super("1 bis 6", 1, 6, 1);
    }

    @Override
    public double toPercent(int note) {

        switch (note) {

            case 6:
                return 7.5;
            case 5:
                return 30;
            case 4:
                return 52;
            case 3:
                return 68.5;
            case 2:
                return 87.5;
            case 1:
                return 98;
            default:
                System.err.println("main.Note ist nicht zwischen 1 und 6");
                return -1;
        }
    }
}
