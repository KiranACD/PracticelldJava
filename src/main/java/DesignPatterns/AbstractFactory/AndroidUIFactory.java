public class AndroidUIFactory implements UIFactory {

    public Button createButton(){
        return new AndroidButton();
    }

    public Dropdown createDropdown(){
        return new AndroidDropdown();
    }

    public Menu createMenu() {
        return new AndroidMenu();
    }
}