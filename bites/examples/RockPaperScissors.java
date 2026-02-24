package bites.examples;

import java.util.HashMap;

public class RockPaperScissors {
    static HashMap<String, HashMap<String, String>> rules = new HashMap<String, HashMap<String, String>>();

    public static String play(String player1, String player2) {
        return rules.get(player1).get(player2);
    }
    public static void main(String[] args) {
        HashMap<String, String> rockResult = new HashMap<String, String>();
        rockResult.put("paper", "Player 2 wins");
        rockResult.put("scissors", "Player 1 wins");
        rockResult.put("rock", "It's a draw");

        HashMap<String, String> paperResult = new HashMap<String, String>();
        paperResult.put("scissors", "Player 2 wins");
        paperResult.put("rock", "Player 1 wins");
        paperResult.put("paper", "It's a draw");

        HashMap<String, String> scissorsResult = new HashMap<String, String>();
        scissorsResult.put("rock", "Player 2 wins");
        scissorsResult.put("paper", "Player 1 wins");
        scissorsResult.put("scissors", "It's a draw");

        rules.put("rock", rockResult);
        rules.put("paper", paperResult);
        rules.put("Scissors", scissorsResult);

        System.out.println(play("rock", "rock"));
        System.out.println(play("paper", "scissors"));

    }

}

