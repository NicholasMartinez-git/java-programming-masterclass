package masterclass.learnprogramming.billsburgers;

public class Hamburger {

    String name;
    String meat;
    double price;
    String breadRollType;

    // Four possible additions to the hamburger
    String addition1Name;
    double addition1Price;

    String addition2Name;
    double addition2Price;

    String addition3Name;
    double addition3Price;

    String addition4Name;
    double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;

        System.out.println(name + "hamburger on a " + breadRollType + " roll with " + meat + ", price is $" + String.format("%.2f", price));
    }

    public void addHamburgerAddition1(String nameAddOn, double priceAddOn) {

    }

    public void addHamburgerAddition2(String nameAddOn, double priceAddOn) {

    }

    public void addHamburgerAddition3(String nameAddOn, double priceAddOn) {

    }

    public void addHamburgerAddition4(String nameAddOn, double priceAddOn) {

    }

    public double itemizeHamburger() {
        // add up all "additions" of the hamburger and return the total price
        return totalPrice;
    }
}
