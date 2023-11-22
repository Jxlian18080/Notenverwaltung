public class Notensystem1Bis6 extends Notensystem {

    Notensystem1Bis6() {
        super("1 bis 6", 1, 6, 1);
    }

    @Override
    public double toPercent(int note) {

        if (note == 6) {
           return 7.5;
        }else if(note == 5){
            return 30;
        }else if(note == 4){
            return 52;
        }else if(note == 3){
            return 68.5;
        }else if(note == 2){
            return 87.5;
        }else if (note == 1){
            return 98;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Notensystem1Bis6 notensystem = new Notensystem1Bis6();
        System.out.printf(""+notensystem.toPercent(10));
    }
}
