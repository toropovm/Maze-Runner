//package application;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class MazeRunner extends Application
{
    public static final int TILE_SIZE = 50;

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {

        maze1 m = new maze1(10,10);

<<<<<<< HEAD

        Pane mapGrid = m.createBoard();
=======
        //TESTING IF PUSHED TO GIT REPO

        //Setting the margin to the nodes
        //vBox.setMargin(welcome, new Insets(20, 20, 20, 20));
        //  vBox.setMargin(playButton, new Insets(20, 20, 20, 20));
        //   vBox.setMargin(stopButton, new Insets(20, 20, 20, 20));
        BorderPane borderPane = new BorderPane();


        borderPane.setCenter(m.createBoard());
        //borderPane.setRight(vBox);

        Scene scene = new Scene(borderPane);
>>>>>>> 073010fbbe3276dfa876ef61e8e4ab3a8ba6f878


        Scene scene = new Scene(mapGrid);
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.UP) {
                    System.out.println("ho");
                }
            }
        });
        primaryStage.setTitle("Maze Runner");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}