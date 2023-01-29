package main;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a game of Snakes and Ladders with one or more players, a board and a dice
 *
 * @author odne
 * @since 1.0
 */

public class Game {
    private List<Player> players;
    private Board board;
    private Dice dice;
    private int currentPlayerIndex;
    private int winnerId;

    /**
     * Initializes a new game of Snakes and Ladders with the specified board size and number of players
     *
     * @param boardSize The size of the game board
     * @param numOfPlayers The number of players participating in the game.
     */
    public Game(int boardSize, int numOfPlayers) {
        this.players = new ArrayList<>();
        this.board = new Board(boardSize);
        this.dice = new Dice(6);
        this.currentPlayerIndex = 0;
        this.winnerId = -1;

        for (int i = 0; i < numOfPlayers; i++) {
            Player player = new Player("Player " + (i+1), i+1);
            this.players.add(player);
            this.board.addPlayer(player.getPlayerName());
        }
    }

    /**
     * Returns the Id of the player who won the game
     *
     * @return The Id of the winning player, or -1 if the game is still going.
     */

    public int getWinnerId() {
        return winnerId;
    }

    /**
     * Plays the game of Snakes and Ladders until a winner is determined.
     */
    public void play() {
        while (winnerId == -1) {
            Player currentPlayer = players.get(currentPlayerIndex); {
                int diceValue = dice.rollDice();
                System.out.println(currentPlayer.getPlayerName() + " rolled a " + diceValue);
                board.movePlayer(currentPlayer.getPlayerName(), diceValue);
                int playerPos = board.getPlayerPos(currentPlayer.getPlayerName());
                System.out.println(currentPlayer.getPlayerName() + " is now at position " + playerPos);
                if (playerPos == board.getBoardSize()) {
                    winnerId = currentPlayer.getPlayerId();
                    break;
                }
                currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
            }
            System.out.println("The winner is Player " + winnerId);
        }
    }
}
