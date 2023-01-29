package main;

import java.util.HashMap;

/**
 * The board class represents the game board in a board game.
 * It contains the size of the board, the positions of all the players, and provides methods to move players on the board.
 *
 * @author odne
 * @since 1.0
 */

public class Board {
    private int boardSize;
    private HashMap<String, Integer> playerPositions;

    /**
     * Constructor for the Board class.
     *
     * @param boardSize the size of the game board
     */

    public Board(int boardSize) {
        this.boardSize = boardSize;
        playerPositions = new HashMap<>();
    }

    /**
     * Gets the size of the game board
     *
     * @return the size of the game board
     */

    public int getBoardSize() {
        return boardSize;
    }

    /**
     * Adds a player to the game board
     *
     * @param playerName the name of the player to be added
     */

    public void addPlayer(String playerName) {
        playerPositions.put(playerName, 0);
    }

    /**
     * Gets the position of a player on the game board
     *
     * @param playerName the name of the player whose position is to be retrieved
     * @return the position of the player on the game board
     */

    public int getPlayerPos(String playerName) {
        return playerPositions.get(playerName);
    }

    /**
     * Move a players piece on the board by the amount of spaces indicated by the dice roll.
     *
     * If the players new position exceeds the last square, their piece will remain standing on the last square.
     *
     * @param playerName the name of the player to be moved
     * @param diceValue the value rolled on the dice
     */

    public void movePlayer(String playerName, int diceValue) {
        int currentPos = playerPositions.get(playerName);
        int newPos = currentPos + diceValue;
        if (newPos > boardSize) {
            return;
        } else if (newPos == boardSize) {
            System.out.println(playerName + " wins!");
        }
        playerPositions.put(playerName, newPos);
    }

    /**
     * Gets the positions of all players on the game board
     *
     * @return a HashMap containing the names of all players as keys and their positions on the game board as values
     */

    public HashMap<String, Integer> getPlayerPositions() {
        return playerPositions;
    }
}
