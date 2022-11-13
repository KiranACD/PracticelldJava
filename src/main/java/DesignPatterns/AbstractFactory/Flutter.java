

public class Flutter {
    public void setTheme() {
        System.out.println("Setting theme");
    }
    public void setRefreshrate() {
        System.out.println("Setting refresh rate");
    }

    public UIFactory createUIFactory(SupportedPlatforms platform) {
        if (platform.equals(platform.ANDROID)) {
            return new AndroidUIFactory();
        
        } else if (platform.equals(platform.IOS)) {
            return new IOSUIFactory();
        }
        return null;
        
    }
}