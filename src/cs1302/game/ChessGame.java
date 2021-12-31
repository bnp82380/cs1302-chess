package cs1302.game;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.Event;

/**
 * This class represents a {@code ChessGame} object containing a
 * chess game board, multiple unique chess pieces, and player moves
 * available to two opponents in a typical game of chess.
 */
public class ChessGame extends Game {

    private static final int WIDTH = 800; //Width of game bounds
    private static final int HEIGHT = 600; //Height of game bounds

    /**
     * Constructs a {@code ChessGame} object.
     */
    public ChessGame() {
        super(WIDTH, HEIGHT, 60);
        setLogLevel(Level.INFO);
    } //ChessGame

    /**
     * Initializes the scene graph for the {@code ChessGame} object.
     *
     * {@inheritDoc}
     */
    @Override
    protected void init() {
        throw new UnsupportedOperationException("Not yet implemented");
    } //init

    /**
     * Updates the scene graph/game board with player and ball positions.
     *
     * {@inheritDoc}
     */
    @Override
    protected void update() {
        throw new UnsupportedOperationException("Not yet implemented");
    } //update

} //ChessGame
