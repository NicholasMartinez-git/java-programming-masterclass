package masterclass.learnprogramming.billsburgers;

public class HealthyBurger extends Hamburger{

    // Two possible additions to the Healthy hamburger
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown Rye");
    }

    public void addHealthyAddition1(String nameAddOn, double priceAddOn) {
        this.healthyExtra1Name = nameAddOn;
        this.healthyExtra1Price = priceAddOn;
    }

    public void addHealthyAddition2(String nameAddOn, double priceAddOn) {
        this.healthyExtra2Name = nameAddOn;
        this.healthyExtra2Price = priceAddOn;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if (this.healthyExtra1Name != null) {
            hamburgerPrice += this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for an extra $" + String.format("%.2f", this.healthyExtra1Price));
        }
        if (this.healthyExtra2Name != null) {
            hamburgerPrice += this.healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + " for an extra $" + String.format("%.2f", this.healthyExtra2Price));
        }
        return hamburgerPrice;
    }
}
