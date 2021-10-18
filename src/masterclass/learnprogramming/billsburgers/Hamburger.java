package masterclass.learnprogramming.billsburgers;

public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    // Four possible additions to the hamburger
    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String nameAddOn, double priceAddOn) {
        this.addition1Name = nameAddOn;
        this.addition1Price = priceAddOn;
    }

    public void addHamburgerAddition2(String nameAddOn, double priceAddOn) {
        this.addition2Name = nameAddOn;
        this.addition2Price = priceAddOn;
    }

    public void addHamburgerAddition3(String nameAddOn, double priceAddOn) {
        this.addition3Name = nameAddOn;
        this.addition3Price = priceAddOn;
    }

    public void addHamburgerAddition4(String nameAddOn, double priceAddOn) {
        this.addition4Name = nameAddOn;
        this.addition4Price = priceAddOn;
    }

    public double itemizeHamburger() {
        // add up all "additions" of the hamburger and return the total price
        System.out.println(name + " hamburger on a " + breadRollType + " roll with " + meat + ", price is $" + String.format("%.2f", price));
        if (this.addition1Name != null) {
            this.price += this.addition1Price;
            System.out.println("Added " + this.addition1Name + " for an extra $" + String.format("%.2f", this.addition1Price));
        }
        if (this.addition2Name != null) {
            this.price += this.addition2Price;
            System.out.println("Added " + this.addition2Name + " for an extra $" + String.format("%.2f", this.addition2Price));
        }
        if (this.addition3Name != null) {
            this.price += this.addition3Price;
            System.out.println("Added " + this.addition3Name + " for an extra $" + String.format("%.2f", this.addition3Price));
        }
        if (this.addition4Name != null) {
            this.price += this.addition4Price;
            System.out.println("Added " + this.addition4Name + " for an extra $" + String.format("%.2f", this.addition4Price));
        }
        return price;
    }
}
