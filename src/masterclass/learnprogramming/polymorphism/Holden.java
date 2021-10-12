/* Section 7 : Coding Exercise 39: Polymorphism */

package masterclass.learnprogramming.polymorphism;

public class Holden extends Car {

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Holden -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Holden -> accelerate().";
    }

    @Override
    public String brake() {
        return "Holden -> brake()";
    }
}
