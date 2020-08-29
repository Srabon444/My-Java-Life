public class DeluxBurger extends Hamburger{
    public DeluxBurger() {
        super("Deluxe", "Sausage & Bacon", 14.54, "White");
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Drinks", 1.75);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Can not add additional item in deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Can not add additional item in deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Can not add additional item in deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Can not add additional item in deluxe burger");
    }
}
