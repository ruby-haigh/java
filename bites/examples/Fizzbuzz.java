package bites.examples;

public class Fizzbuzz {
    private static String play(Integer input) {
        if (input % 15 == 0) {
            return "Fizzbuzz";
        }else if (input % 3 == 0) {
            return "Fizz";
        }else if (input % 5 == 0) {
            return "Buzz";
        }else {
            return Integer.toString(input);
        }
    }
    public static void main(String[] args) {
        // For loop for Fizzbuzz 1 to 100
//        for (Integer counter = 1; counter <= 100; counter ++) {
//            System.out.println(Fizzbuzz.play(counter));
//        }
        Integer counter = 1;
        while (counter <= 100) {
            System.out.println(Fizzbuzz.play(counter));
            counter ++;
        }

//        System.out.println(Fizzbuzz.play(1));
//        System.out.println(Fizzbuzz.play(3));
//        System.out.println(Fizzbuzz.play(5));
//        System.out.println(Fizzbuzz.play(15));

    }
}
