package bites.birds;

public class Crow implements BirdBehaviours{
    public static void main(String[] args) {
        Crow crow = new Crow();
        crow.fly();
        crow.sing();
        crow.eat();
    }

    @Override
    public void fly() {
        System.out.println("Crows are pretty good at flying don't you know");

    }

    @Override
    public void sing() {
        System.out.println("Warble warble squark");

    }

    @Override
    public void eat() {
        System.out.println("I loooove delicious worms and grubs!");

    }
}
