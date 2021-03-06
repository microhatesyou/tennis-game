package org.acme;

import java.util.HashMap;
import java.util.Map;

public class GameScore {

    private final Map<Player, SCORE> gameScore;

    public static GameScore of(Player playerOne, Player playerTwo) {

        return new GameScore(calculateGameScore(playerOne, playerTwo));
    }

    private static Map<Player, SCORE> calculateGameScore(Player playerOne, Player playerTwo) {
        Map<Player, SCORE> score = new HashMap<>();

        if (playerOne.getPoints() <= 3 && playerTwo.getPoints() <= 3) {
            score.put(playerOne, SCORE.fromPoints(playerOne.getPoints()));
            score.put(playerTwo, SCORE.fromPoints(playerTwo.getPoints()));
        } else if (playerOne.getPoints() == playerTwo.getPoints()) {
            score.put(playerOne, SCORE.DEDUCE);
            score.put(playerTwo, SCORE.DEDUCE);
        } else if (playerOne.getPoints() > playerTwo.getPoints()) {
            score.put(playerOne, SCORE.ADVANTAGE);
            score.put(playerTwo, SCORE.FORTY);
        } else {
            score.put(playerOne, SCORE.FORTY);
            score.put(playerTwo, SCORE.ADVANTAGE);
        }

        return score;
    }

    private GameScore(Map<Player, SCORE> gameScore) {
        this.gameScore = gameScore;
    }
}
