package udemyfullcourse.timbuchalkavariables;
//An Application that calculates the final score of a game when the game is over.

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class ScoreBoard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter game score");
        int score = scanner.nextInt();
        System.out.println("Enter the level of game completed");
        int levelCompleted = scanner.nextInt();
        System.out.println("Enter the bonus given");
        int bonus = scanner.nextInt();

        int realScore = scoreRecorded(true, score, levelCompleted, bonus);
        System.out.println("The final score = " + realScore);
    }
    public static int scoreRecorded(boolean gameOver, int score, int levelCompleted, int bonus) {
        gameOver = true;
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
           // System.out.println("Your Score = " + finalScore);
            return finalScore;
        } else {
            return -1;
        }
    }
}
