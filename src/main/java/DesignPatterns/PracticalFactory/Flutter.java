

public class Flutter {

    public void setTheme() {
        System.out.println("Setting theme");
    }
    public void setRefreshrate() {
        System.out.println("Setting refresh rate");
    }

    public UIFactory createUIFactory(SupportedPlatforms platform) {
        return UIFactoryFactory.getUIFactoryForPlatform(platform);
        
    }
}