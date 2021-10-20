/* Section 7 : Coding Exercise 40: Bill's Burgers */

package masterclass.learnprogramming.billsburgers;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is $" + String.format("%.2f", hamburger.itemizeHamburger()));

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHealthyAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition2("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is $" + String.format("%.2f", healthyBurger.itemizeHamburger()));

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition3("Should not do this", 50.43);
        System.out.println("Total Deluxe Burger price is $" + String.format("%.2f", deluxeBurger.itemizeHamburger()));

    }
}
