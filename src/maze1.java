import javafx.scene.layout.GridPane;

public class maze1 extends maze {
    // tile size
    private int TILE_SIZE = 30;

    // constructor
    public maze1(){
      super(700, 550);
      super.setPlayer(new userPlayer(TILE_SIZE,TILE_SIZE));
      super.setComputer(new computerPlayer(300,90));

      //addition monster positions
      super.setComputer2(new computerPlayer(600,210));
      super.setComputer3(new computerPlayer(900,210));
      super.setComputer4(new computerPlayer(450,210));
    }

    @Override
    public int getTileSize(){
        return TILE_SIZE;
    }

    private GridPane grid = super.initializeLevel("level1.txt", TILE_SIZE);;

    public GridPane getGrid(){
        return grid;
    }

}
