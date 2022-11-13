
public class Client {

    public static void main (String[] args) {

        IcecreamCone icecream = new ChocolateChips(new VanillaScoop(new ChocolateScoop(new VanillaScoop(new ChocolateCone()))));
        System.out.println(icecream.getDescription());
        System.out.println(icecream.getCost());

    }
}