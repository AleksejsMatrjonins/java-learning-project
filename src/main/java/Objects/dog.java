package Objects;

public class dog extends Animal {

    public void bark() {
        System.out.println("Barking...");
    }

    @Override
    public void eat() {
        System.out.println("Dog eating! Woof-Woof!");
    }
}
