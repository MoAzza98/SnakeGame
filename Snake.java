import java.awt.event.*; 
import java.awt.*; 
import javax.swing.*; 

public class Snake extends JFrame{

    public void createWindow(){
        

    }

    public void updateWindow(){



        //drawSnake();
    }


    public static void main(String[] args) {

        Snake gui = new Snake();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(500, 500);
        gui.setVisible(true);
        gui.setTitle("Snake");
        gui.updateWindow();

    }

}