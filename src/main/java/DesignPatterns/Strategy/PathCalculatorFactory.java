
public class PathCalculatorFactory {

    public static PathCalculator getPathCalculatorByMode(String mode) {
        if (mode.equals("car")) {
            System.out.println("car");
            return new CarPathCalculator();
        } else if (mode.equals("bike")) {
            System.out.println("bike");
            return new BikePathCalculator();
        } else {
            System.out.println("else");
            return new WalkPathCalculator();
        }
    }
}