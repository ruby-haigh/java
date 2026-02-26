package bites.examples;

import java.util.HashMap;

public class ScrabbleScore {
    HashMap<String, Integer> letterValues;

    public ScrabbleScore() {
        this.letterValues = new HashMap<String, Integer>();
        this.letterValues.put("A", 1);
        this.letterValues.put("B", 3);
        this.letterValues.put("C", 3);
        this.letterValues.put("D", 2);
        this.letterValues.put("E", 1);
        this.letterValues.put("F", 4);
        this.letterValues.put("G", 2);
        this.letterValues.put("H", 4);
        this.letterValues.put("I", 1);
        this.letterValues.put("J", 8);
        this.letterValues.put("K", 5);
        this.letterValues.put("L", 1);
        this.letterValues.put("M", 3);
        this.letterValues.put("N", 1);
        this.letterValues.put("O", 1);
        this.letterValues.put("P", 3);
        this.letterValues.put("Q", 10);
        this.letterValues.put("R", 1);
        this.letterValues.put("S", 1);
        this.letterValues.put("T", 1);
        this.letterValues.put("U", 1);
        this.letterValues.put("V", 4);
        this.letterValues.put("W", 4);
        this.letterValues.put("X", 8);
        this.letterValues.put("Y", 4);
        this.letterValues.put("Z", 10);
    }

    public Integer calculate(String word) {
        String[] letterList = word.toUpperCase().split("");
        Integer total = 0;
        for (int index = 0; index < letterList.length; index ++) {
            Integer value = this.letterValues.get(letterList[index]);
            total += value;
        }
        return total;
    }

    public static void main(String[] args) {
        ScrabbleScore score = new ScrabbleScore();
//        System.out.println(score.letterValues.get("H"));
//        System.out.println(score.letterValues.get("E"));
//        System.out.println(score.letterValues.get("L"));
//        System.out.println(score.letterValues.get("L"));
//        System.out.println(score.letterValues.get("O"));
        System.out.println(score.calculate("heLlO"));
    }
}
