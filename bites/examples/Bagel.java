package bites.examples;

public class Bagel {
    String seeds;
    String filling;
    Integer price;

    public Bagel(String seeds1, String filling, Integer price) {
        this.seeds = seeds1; //using different variable names to explore the parameter vs instance variable
        this.filling = filling;
        this.price = price;
    }

    public String getSeeds() {
        return seeds;
    }

    public String getFilling() {
        return this.filling;
    }

    public Integer getPrice() {
        return this.price;
    }

    public static void main(String[] args) {
        Bagel NewYorkNewYork = new Bagel("Sesame", "Pepper Cream Cheese", 7);
        System.out.println(NewYorkNewYork.getSeeds());
        System.out.println(NewYorkNewYork.getFilling());
        System.out.println("$" + NewYorkNewYork.getPrice());
    }
}
