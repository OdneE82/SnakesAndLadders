package main;

/**
 * Represents a player in a board game
 *
 * @author odne
 * @since 1.0
 */

public class Player {
    private String playerName;
    private int playerId;

    /**
     * Constructs a player with the specified name and Id
     *
     * @param playerName the name of the player
     * @param playerId the Id of the player
     */

    public Player(String playerName, int playerId) {
        this.playerId = playerId;
        this.playerName = playerName;
    }

    /**
     * Returns the name of the player
     *
     * @return the name of the player
     */

    public String getPlayerName() {
        return playerName;
    }

    /**
     * Returns the Id of the player
     *
     * @return Id of the player
     */

    public int getPlayerId() {
        return playerId;
    }

    /**
     * Returns a string representation of the player
     *
     * @return a string representation of the player
     */

    public String toString() {
        return "Player name: " + playerName + " | Player ID: " + playerId;
    }
}
