package bites.examples;

public class Quotes {
    public static String Hawking() {
        return "Hawking: \"Remember to look up at the stars and not down at your feet.\"";
    }

    public static String Einstein() {
        return "Einstein: \"The human mind is not capable of grasping the universe.\"";
    }

    public static String Dirac() {
        return "Dirac: \"God used beautiful mathematics in creating the world.\"";
    }

    public static String Higgs() {
        return "Higgs: \"It's nice to be right sometimes.\"";
    }

    public static void main(String[] args) {
        System.out.println(Quotes.Hawking());
        System.out.println(Quotes.Einstein());
        System.out.println(Quotes.Dirac());
        System.out.println(Quotes.Higgs());
    }
}
