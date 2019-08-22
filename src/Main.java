public class Main {
    public static void main(String[] args) {
        double ft = 0;
        double in = 1;
        double centimetres = FeetInchesCentimetres.calcFeetAndInchesToCentimetres(ft, in);
        if (centimetres < 0.0) {
            System.out.println("Invalid parameters");
        } else {
            FeetInchesCentimetres.calcFeetAndInchesToCentimetres(ft, in);
        }
    }
}
