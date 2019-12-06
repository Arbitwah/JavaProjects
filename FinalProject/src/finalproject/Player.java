/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Player extends Sprite implements Common {

    private final int START_Y = 560;
    private final int START_X = 540;

    private final String playerImg = "src/Images/laser.png";
    private int width;

    public Player() {
        initPlayer();
    }

    private void initPlayer() {
        ImageIcon playImg = new ImageIcon(playerImg);
        width = playImg.getImage().getWidth(null);
        setImage(playImg.getImage());
        setX(START_X);
        setY(START_Y);
    }

    public void act() {
        x += dx;
        if (x <= 4) {
            x = 4;
        }
        if (x >= BOARD_WIDTH - 4 * width) {
            x = BOARD_WIDTH - 4 * width;
        }
    }

    public void keyPressed(KeyEvent e) {
        int pressedKey = e.getKeyCode();

        if (pressedKey == KeyEvent.VK_LEFT) {
            dx = -4;
        }

        if (pressedKey == KeyEvent.VK_RIGHT) {
            dx = 4;
        }

    }

    public void keyReleased(KeyEvent e) {
        int releasedKey = e.getKeyCode();
        if (releasedKey == KeyEvent.VK_LEFT) {
            dx = 0;
        }
        if (releasedKey == KeyEvent.VK_RIGHT) {
            dx = 0;
        }
    }
}
