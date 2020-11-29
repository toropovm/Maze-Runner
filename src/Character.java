import javafx.scene.shape.Rectangle;

/***
 * abstract class that extends triangle and represents the characters in the game
 * NOTE: NOT USED YET IN MAIN
 */
public abstract class Character extends Rectangle {
    private String name;
    private boolean isWin;
    private int X;
    private int Y;

    public void setName(String n){
        name = n;
    }
    public String getName(){return name;}


    public  Character( int x, int y) {
          isWin = false;
          X = x;
          Y = y;
    }

    // abstract method moving the character
    public abstract void move(int dir, maze m );

    public abstract double getPlayerY();

    public abstract double getPlayerX();
}