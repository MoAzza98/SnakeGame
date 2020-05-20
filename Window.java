import java.awt.*;
import javax.swing.*;

public class Window extends JFrame{
    
    public void makeBoard(int x, int y){

        Snake player = new Snake();
        JFrame gameScreen = new JFrame();
        gameScreen.setBounds(10, 10, x, y);
        gameScreen.setBackground(Color.BLACK);
        gameScreen.setResizable(false);
        gameScreen.setVisible(true);
        gameScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameScreen.setTitle("Snake");
        gameScreen.add(player);

    }

}