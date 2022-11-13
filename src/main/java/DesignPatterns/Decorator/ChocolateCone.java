
public class ChocolateCone implements IcecreamCone{
    private IcecreamCone cone;

    public ChocolateCone() {

    }
    public ChocolateCone(IcecreamCone cone) {
        this.cone = cone;
    }
    public double getCost() {
        if (this.cone == null) {
            return 12.0;
        } else {
            return cone.getCost() + 12.0;
        }

    }
    public String getDescription() {
        if (this.cone == null) {
            return "Chocolate Cone";
        } else {
            return this.cone.getDescription() + " Chocolate Cone";
        }
    }
}
