package bites.birds;

public class Penguin implements BirdBehaviours{
    public static void main(String[] args) {
        Penguin penguin = new Penguin();
        penguin.fly();
        penguin.eat();
        penguin.sing();
    }

    @Override
    public void fly() {
        System.out.println("I can't fly :(");
    }

    @Override
    public void sing() {
        System.out.println("sqwaaaaark");
    }

    @Override
    public void eat() {
        System.out.println("I like to eat fish");
    }
}
