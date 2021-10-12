/* Section 7 : Coding Exercise 39: Polymorphism */

package masterclass.learnprogramming.polymorphism;

public class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Ford -> accelerate().";
    }

    @Override
    public String brake() {
        return "Ford -> brake()";
    }
}
