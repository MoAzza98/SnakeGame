import java.awt.*;
import javax.swing.*;

public class Snake extends JPanel{

    private ImageIcon snakeHead;
    
    public void paint(Graphics g){

        snakeHead = new ImageIcon("Resources\\snakeHead.png");
        snakeHead.paintIcon(this, g, 200, 200);

    }

}