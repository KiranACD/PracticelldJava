public class IOSUIFactory implements UIFactory {

    public Button createButton(){
        return new IOSButton();
    }

    public Dropdown createDropdown(){
        return new IOSDropdown();
    }

    public Menu createMenu() {
        return new IOSMenu();
    }
}
