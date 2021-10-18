package masterclass.learnprogramming.billsburgers;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 14.54, "White");
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Drink", 1.81);
    }

    @Override
    public void addHamburgerAddition1(String nameAddOn, double priceAddOn) {
        System.out.println("No additional items can be added to the Deluxe burger!");
    }

    @Override
    public void addHamburgerAddition2(String nameAddOn, double priceAddOn) {
        System.out.println("No additional items can be added to the deluxe burger!");;
    }

    @Override
    public void addHamburgerAddition3(String nameAddOn, double priceAddOn) {
        System.out.println("No additional items can be added to the deluxe burger!");
    }

    @Override
    public void addHamburgerAddition4(String nameAddOn, double priceAddOn) {
        System.out.println("No additional items can be added to the deluxe burger!");
    }
}
