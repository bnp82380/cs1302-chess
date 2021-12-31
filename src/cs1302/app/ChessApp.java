package cs1302.app;

import cs1302.game.ChessGame;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * This class is a JavaFX {@link Application} for running a {@link PongGame} object
 * representing a game of "Chess".
 */
public class ChessApp extends Application {

    /**
     * Constructs a {@code ChessApp} object. This default (i.e., no argument)
     * constructor is executed in Step 2 of the JavaFX Application Life-Cycle.
     */
    public ChessApp() {} //ChessApp

    /** {@inheritDoc} */
    @Override
    public void start(Stage stage) {

        ChessGame game = new ChessGame();

        // Setup game scene
        VBox root = new VBox(game);
        Scene scene = new Scene(root);

        // Setup stage
        stage.setTitle("Chess");
        stage.setScene(scene);
        stage.setOnCloseRequest(event -> Platform.exit());
        stage.sizeToScene();
        stage.show();

        // Play the game
        game.play();

    } //start
} //ChessApp
