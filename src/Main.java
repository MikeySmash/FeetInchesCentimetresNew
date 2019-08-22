public class Main {
    public static void main(String[] args) {
        double ft = 8;
        double in = 4;
        double allInches = 100;
        double centimetres = FeetInchesCentimetres.calcFeetAndInchesToCentimetres(ft, in);
        double cmFromInches = FeetInchesCentimetres.calcFeetAndInchesToCentimetres(allInches);
        if (centimetres < 0.0) {
            System.out.println("Invalid parameters");
        }
        if (cmFromInches < 0.0) {
            System.out.println("Invalid parameters");
        }

    }
}
