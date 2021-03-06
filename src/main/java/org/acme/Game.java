package org.acme;

public class Game {

    private final Player playerOne;
    private final Player playerTwo;

    public Game(String playerOne, String playerTwo) {
        this.playerOne = new Player(playerOne);
        this.playerTwo = new Player(playerTwo);
    }

    public GameScore addPoint(String player) {
        if (playerOne.getName().equals(player))
            playerOne.addPoint();
        else if (playerTwo.getName().equals(player))
            playerTwo.addPoint();
        else
            throw new IllegalStateException("unknown player " + player);

        return GameScore.of(this.playerOne, this.playerTwo);
    }

    public GameScore getScore() {
        return GameScore.of(this.playerOne, this.playerTwo);
    }
}
