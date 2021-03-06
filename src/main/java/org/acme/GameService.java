package org.acme;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GameService {

    private Game game = null;

    public GameScore start(String playerOne, String playerTwo) {
        game = new Game(playerOne, playerTwo);
        return game.getScore();
    }

    public GameScore addPoint(String forPlayer) {
        if (game == null)
            throw new IllegalStateException("game is not strted yet");

        game.addPoint(forPlayer);
        return game.getScore();
    }
}
