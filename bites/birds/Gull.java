package bites.birds;

public class Gull implements BirdBehaviours{
    public static void main(String[] args) {
        Gull gull = new Gull();
        gull.fly();
        gull.sing();
        gull.eat();
    }

    @Override
    public void fly() {
        System.out.println("I gliiiiiide over the ocean");
    }

    @Override
    public void sing() {
        System.out.println("Oh I do like to be beside the seaside");

    }

    @Override
    public void eat() {
        System.out.println("I'll have your fish and chips if you're not careful!");

    }
}
