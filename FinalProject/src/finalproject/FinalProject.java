//Name: Gregory Pugh
//Assignment: Final Project
//Date Started:06/25/2019
//Date Ended:
//Instructor: Ross Lawerence
package finalproject;
import java.awt.EventQueue;
import javax.swing.JFrame;
public class FinalProject extends JFrame implements Common{
    public FinalProject(){
    initUI();
    }
    private void initUI(){
    add(new Board());
    setTitle("Space Invaders ");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(BOARD_WIDTH,BOARD_HEIGHT);
    setLocationRelativeTo(null);
    setResizable(false);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
        FinalProject game = new FinalProject();
        game.setVisible(true);
        });
    }
    
}
