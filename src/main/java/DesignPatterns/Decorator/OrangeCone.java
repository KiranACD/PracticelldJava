
public class OrangeCone implements IcecreamCone {
    private IcecreamCone cone;

    public OrangeCone() {

    }
    public OrangeCone(IcecreamCone cone) {
        this.cone = cone;
    }
    public double getCost() {
        if (this.cone == null) {
            return 10.0;
        } else {
            return this.cone.getCost() + 10.0;
        }

    }

    public String getDescription() {
        if (this.cone == null) {
            return "Orange Cone";
        } else {
            return this.cone.getDescription() + " Orange Cone";
        }
    }
}