import javax.swing.*;

public class Game extends JPanel{



    public enum gamestate{
        PAUSED,
        RUNNING,
        OVER
    }

    public static void main(String[] args){

        Window game = new Window();
        game.makeBoard(500, 500);
        

    }
}