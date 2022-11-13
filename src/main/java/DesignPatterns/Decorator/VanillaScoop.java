
public class VanillaScoop implements IcecreamCone {

    private IcecreamCone cone;

    public VanillaScoop(IcecreamCone cone) {
        this.cone = cone;
    }
    public double getCost() {

        return cone.getCost() + 15.0;

    }
    public String getDescription() {

        return this.cone.getDescription() + " Vanilla Scoop";

    }
}
