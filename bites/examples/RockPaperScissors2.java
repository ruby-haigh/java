package bites.examples;
import java.util.HashMap;

public class RockPaperScissors2 {
    static HashMap<String, String> rules = new HashMap<String, String>();

    public static String play(String player1, String player2) {
        if (player1 == player2) {
            return "It's a draw";
        }else if (rules.get(player1) == player2) {
            return "Player 1 wins";
        }else {
            return "Player 2 wins";
        }
    }
    public static void main(String[] args) {
        rules.put("rock", "scissors");
        rules.put("paper", "rock");
        rules.put("scissors", "paper");

        System.out.println(play("rock", "paper"));
        System.out.println(play("paper", "paper"));
        System.out.println(play("scissors", "paper"));

    }
}
