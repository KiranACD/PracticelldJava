
public class ChocolateScoop implements IcecreamCone{

    private IcecreamCone cone;

    public ChocolateScoop(IcecreamCone cone) {
        this.cone = cone;
    }
    public double getCost() {

        return cone.getCost() + 20.0;

    }
    public String getDescription() {

        return this.cone.getDescription() + " Chocolate Scoop";

    }
}