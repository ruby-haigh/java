package bites.examples;
import java.util.HashMap;

public class ScratchPad {

    public static void main(String[] args) {
        HashMap<String, Integer[]> scores = new HashMap<String, Integer[]>();
        scores.put("Triva Newton John", new Integer[] {5, 3});
        scores.put("Les Quizerables", new Integer[] {10, 9});
        scores.put("Quizteama Aguilera", new Integer[] {1, 3});
        System.out.println(scores.get("Les Quizerables")[1]);

    }
}
