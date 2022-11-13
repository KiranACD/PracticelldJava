
public class ChocolateChips implements IcecreamCone {
    
    private IcecreamCone cone;
    
    public ChocolateChips(IcecreamCone cone) {
        this.cone = cone;
    }

    public double getCost() {
        return cone.getCost() + 5.0;
    }

    public String getDescription() {
        return this.cone.getDescription() + " Chocolate Chips";
    }

}