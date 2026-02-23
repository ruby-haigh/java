package bites.examples;
import java.util.ArrayList;

public class Sandbox {
    public static void main(String[] args) {
        ArrayList<String> contentsOfMyPocket = new ArrayList<String>();
        contentsOfMyPocket.add("keys");
        contentsOfMyPocket.add("phone");
        contentsOfMyPocket.add("fluff");
        for (String content : contentsOfMyPocket) {
            System.out.println(content);
        }
        System.out.println(contentsOfMyPocket.get(0));


        // first, create the ArrayList and add some Integers
        ArrayList<Integer> reallyGreatNumbers = new ArrayList<Integer>();
        reallyGreatNumbers.add(3);
        reallyGreatNumbers.add(5);
        reallyGreatNumbers.add(7);
        reallyGreatNumbers.add(11);

        // you can read / get an item using its index
        reallyGreatNumbers.get(0);
        // => 3
        
        reallyGreatNumbers.get(1);
        // => 5

        // you can change an item using its index and the new value
        reallyGreatNumbers.set(0, 11);
        // would change the first item to 11

        // you can remove an item using its index
        reallyGreatNumbers.remove(0);
        // would remove the first item
    }
}
