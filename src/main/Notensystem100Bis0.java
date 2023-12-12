package main;

public class Notensystem100Bis0 extends Notensystem {

    Notensystem100Bis0() {
        super("100 bis 0", 100, 0, 1);
    }

    @Override
    public double toPercent(int note) {
        return 0;
    }
}
