package Test;

import main.Board;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class BoardTest {
    private Board board;

    @Before
    public void setUp() {
        board = new Board(100);
        board.addPlayer("Player1");
    }

    @Test
    public void testGetBoardSize() {
        Board board = new Board(100);
        assertEquals(100, board.getBoardSize());
    }

    @Test
    public void testAddPlayer() {
        Board board = new Board(100);
        board.addPlayer("Player1");
        board.addPlayer("Player2");
        board.addPlayer("Player3");
        HashMap<String, Integer> playerPositions = board.getPlayerPositions();
        assertEquals(3, playerPositions.size());
        assertEquals(0, (int)playerPositions.get("Player1"));
        assertEquals(0, (int)playerPositions.get("Player2"));
        assertEquals(0, (int)playerPositions.get("Player3"));
    }

    @Test
    public void testGetPlayerPos() {
        assertEquals(0, board.getPlayerPos("Player1"));
    }

    @Test
    public void testMovePlayer() {
        Board board = new Board(100);
        board.addPlayer("Player 1");

        board.movePlayer("Player 1", 6);
        assertEquals(6, board.getPlayerPos("Player 1"));

        board.movePlayer("Player 1", 94);
        assertEquals(100, board.getPlayerPos("Player 1"));

        board.movePlayer("Player 1", 4);
        assertEquals(100, board.getPlayerPos("Player 1"));
    }
}
