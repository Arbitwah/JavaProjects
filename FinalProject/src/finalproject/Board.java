/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.io.PrintWriter; 
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Board extends JPanel implements Runnable, Common {

    private Dimension d;
    private ArrayList<Alien> aliens;
    private Player player;
    private Shot shot;

    private final int ALIEN_INIT_X = 150;
    private final int ALIEN_INIT_Y = 5;
    private int direction = -1;
    private int deaths = 0;
    private int curScore = 0;
    private int curRem = 24;
    private int oldHigh = 0;

    private boolean ingame = true;
    private final String explImg = "src/images/explosion.png";
    private String message = "GAME OVER";
    private String scoreMessage ="";
    private String alienMessage="";

    private Thread animator;

    public Board() {
        initBoard();
    }

    private void initBoard() {
        addKeyListener(new TAdapter());
        setFocusable(true);
        d = new Dimension(BOARD_WIDTH, BOARD_HEIGHT);
        setBackground(Color.black);

        gameInit();
        setDoubleBuffered(true);
    }

    @Override
    public void addNotify() {
        super.addNotify();
        gameInit();
    }

    public void gameInit() {

        aliens = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                Alien alien = new Alien(ALIEN_INIT_X + 36 * j, ALIEN_INIT_Y + 36 * i);
                aliens.add(alien);
            }
        }

        player = new Player();
        shot = new Shot();
        if (animator == null || !ingame) {
            animator = new Thread(this);
            animator.start();
        }

    }

    public void drawAliens(Graphics g) {
        Iterator it = aliens.iterator();

        for (Alien alien : aliens) {
            if (alien.isVisible()) {
                g.drawImage(alien.getImage(), alien.getX(), alien.getY(), this);
            }
            if (alien.isDying()) {
                alien.die();
            }
        }

    }

    public void drawPlayer(Graphics g) {
        if (player.isVisible()) {
            g.drawImage(player.getImage(), player.getX(), player.getY(), this);
        }
        if (player.isDying()) {
            player.die();
            ingame = false;
        }
    }

    public void drawShot(Graphics g) {
        if (shot.isVisible()) {
            g.drawImage(shot.getImage(), shot.getX(), shot.getY(), this);
        }
    }

    public void drawBombing(Graphics g) {
        for (Alien ship : aliens) {
            Alien.Bomb b = ship.getBomb();
            if (!b.isDestroyed()) {
                g.drawImage(b.getImage(), b.getX(), b.getY(), this);
            }
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        try{
        File file = new File("\\Users\\arbit\\Documents\\NetBeansProjects\\FinalProject\\Final.txt");
        Scanner scan = new Scanner(file);
        oldHigh = scan.nextInt();
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }

        g.setColor(Color.black);
        g.fillRect(0, 0, d.width, d.height);
        g.setColor(Color.red);

        if (ingame) {//renders visuals
            g.drawLine(0, GROUND, BOARD_WIDTH, GROUND); 
            g.drawString("Score: ",550,650);
            g.drawString(curScore+"",600,650);
            g.drawString("Aliens: ", 400, 650);
            g.drawString(curRem+"",450,650);
            g.drawString("Last High Score: ", 490, 600);
            g.drawString(oldHigh+"",600,600);
            g.drawString("Thank You All for the Fun Summer Semester", 0,650);
            drawAliens(g);
            drawPlayer(g);
            drawShot(g);
            drawBombing(g);
           
        }
        Toolkit.getDefaultToolkit().sync();
        g.dispose();
    }

    public void gameOver() {
        Graphics g = this.getGraphics();
        g.setColor(Color.black);
        g.fillRect(0, 0, BOARD_WIDTH, BOARD_HEIGHT);

        g.setColor(new Color(0, 32, 48));
        g.fillRect(50, BOARD_WIDTH / 2 - 30, BOARD_WIDTH - 100, 50);

        Font small = new Font("Tahoma", Font.BOLD, 14);
        FontMetrics metr = this.getFontMetrics(small);
        saveHighScore();
        g.setColor(Color.white);
        g.setFont(small);
        g.drawString(message, (BOARD_WIDTH - metr.stringWidth(message)) / 2, BOARD_WIDTH / 2);
        g.drawString(scoreMessage, (BOARD_WIDTH - metr.stringWidth(message)) / 2, BOARD_WIDTH / 4);
        g.drawString(alienMessage, (BOARD_WIDTH - metr.stringWidth(message)) / 2, BOARD_WIDTH / 5);

    }

    public void animationCycle() {
        if (deaths == NUMBER_OF_ALIENS_TO_DESTROY) {
            ingame = false;
            message = "Congradulations on destorying the Alien mennace!";
        }
        //player
        player.act();
        //shots
        if (shot.isVisible()) {
            int shotX = shot.getX();
            int shotY = shot.getY();

            for (Alien alien : aliens) {
                int alienX = alien.getX();
                int alienY = alien.getY();
                if (alien.isVisible() && shot.isVisible()) {
                    if (shotX >= (alienX) && shotX <= (alienX + ALIEN_WIDTH) && shotY >= (alienY) && shotY <= (alienY + ALIEN_HEIGHT)) {//alien is hit by the shot
                        ImageIcon explosionI = new ImageIcon(explImg); //gets the explosion image
                        alien.setImage(explosionI.getImage()); // changes the alien image to the explosion image
                        alien.setDying(true);//sets the alien to dead
                        deaths++;//increases how many aliens are dead
                        curScore+=100;
                        curRem--;
                        shot.die();//shot is no longer visible
                    }
                }
            }
            int y = shot.getY();
            y -= 8;
            if (y < 0) {
                shot.die();
            } else {
                shot.setY(y);
            }
        }
        //aliens
        for (Alien alien : aliens) {
            int x = alien.getX();
            if (x >= BOARD_WIDTH - BORDER_RIGHT && direction != -1) {// detects the edge of the board and shifts the aliens
                direction = -1;
                Iterator i1 = aliens.iterator();
                while (i1.hasNext()) {
                    Alien a2 = (Alien) i1.next();
                    a2.setY(a2.getY() + GO_DOWN);
                }
            }
            if (x <= BORDER_LEFT && direction != 1) {//detects the edge of the board and shifts the alients
                direction = 1;
                Iterator i2 = aliens.iterator();
                while (i2.hasNext()) {
                    Alien a = (Alien) i2.next();
                    a.setY(a.getY() + GO_DOWN);
                }
            }
        }
        Iterator it = aliens.iterator();
        while (it.hasNext()) {
            Alien alien = (Alien) it.next();
            if (alien.isVisible()) {
                int y = alien.getY();
                if (y > GROUND - ALIEN_HEIGHT) {//The aliens have landed and the game is over the player loses
                    ingame = false;
                    message = "THE INVASION BEGINS!";
                }
                alien.act(direction);
            }
        }
        //bombs
        Random generator = new Random();

        for (Alien a4 : aliens) {
            int shot = generator.nextInt(15);
            Alien.Bomb b = a4.getBomb();
            if (shot == CHANCE && a4.isVisible() && b.isDestroyed()) {
                b.setDestroyed(false);
                b.setX(a4.getX());
                b.setY(a4.getY());
            }
            int bombX = b.getX();
            int bombY = b.getY();
            int playerX = player.getX();
            int playerY = player.getY();

            if (player.isVisible() && !b.isDestroyed()) {

                if (bombX >= playerX && bombX <= (playerX + PLAYER_WIDTH) && bombY >= playerY && bombY <= (playerY + PLAYER_HEIGHT)) {
                    ImageIcon explosion = new ImageIcon(explImg);
                    player.setImage(explosion.getImage());
                    player.setDying(true);
                    b.setDestroyed(true);
                }
            }
            if (!b.isDestroyed()) {
                b.setY(b.getY() + 1);
                if (b.getY() >= GROUND - BOMB_HEIGHT) {
                    b.setDestroyed(true);
                }
            }
        }
    }

    @Override
    public void run() {
        long beforeTime, timeDiff, sleep;
        beforeTime = System.currentTimeMillis();
        while (ingame) {
            repaint();
            animationCycle();
            timeDiff = System.currentTimeMillis() - beforeTime;
            sleep = DELAY - timeDiff;
            if (sleep < 0) {
                sleep = 2;
            }
            try {
                Thread.sleep(sleep);
                } catch (InterruptedException e) {
                    System.out.println("interrupted");
            }
            beforeTime = System.currentTimeMillis();
        }
        gameOver();

    }

    private class TAdapter extends KeyAdapter {

        @Override
        public void keyReleased(KeyEvent e) {
            player.keyReleased(e);
        }

        @Override
        public void keyPressed(KeyEvent e) {
            //int key = e.getKeyCode();
            player.keyPressed(e);
            int x = player.getX();
            int y = player.getY();

            if (ingame) {
                if (!shot.isVisible()) {
                    shot = new Shot(x, y);
                }
            }
        }
    }//end of TAdapter
    
    public void saveHighScore(){
        int score = 0;
        for(int i = 0; i < deaths+1; i++){
            score = (i*100);
    }
        scoreMessage = "Score:  " + score;
        alienMessage = "Aliens left alive : "+curRem;
        if(curScore > oldHigh){
        try{
        PrintWriter file = new PrintWriter("Final.txt");
        file.println(score);
        file.flush();
        file.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        }
}
}
