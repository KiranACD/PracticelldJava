
public class GoogleMaps {
    private PathCalculator pathcal;

    public void findPath(String from, String to, String mode) {
        this.pathcal = PathCalculatorFactory.getPathCalculatorByMode(mode);
        this.pathcal.findPath(from, to);
    }
}