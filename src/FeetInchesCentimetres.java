public class FeetInchesCentimetres {
    public static double calcFeetAndInchesToCentimetres(double feet, double inches) {

        if (feet < 0 || inches < 0 || inches > 12) {
            return -1;
        }
        double numberOfInches = (feet * 12) + inches;
        double centimetres = numberOfInches * 2.54;
        System.out.println(feet + " ft and " + inches + " in = " + centimetres + " cm.");
        return centimetres;
    }

    public static double calcFeetAndInchesToCentimetres(double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " in = " + feet + " ft and " + remainingInches + " in.");
        return calcFeetAndInchesToCentimetres(feet, remainingInches);
    }
}

