public class Notensystem15Bis0 extends Notensystem {

    Notensystem15Bis0() {
        super("15 Bis 0", 15, 0, 1);
    }

    @Override
    public double toPercent(int note) {
        switch (note) {

            case 0:
                return 10;
            case 1:
                return 23.5;
            case 2:
                return 29.5;
            case 3:
                return 36;
            case 4:
                return 42;
            case 5:
                return 47;
            case 6:
                return 52;
            case 7:
                return 57;
            case 8:
                return 62;
            case 9:
                return 67;
            case 10:
                return 72;
            case 11:
                return 77;
            case 12:
                return 82;
            case 13:
                return 87;
            case 14:
                return 92;
            case 15:
                return 97.5;

            default:
                System.err.println("Note ist nicht zwischen 15 und 0");
                return -1;
        }

    }
}
