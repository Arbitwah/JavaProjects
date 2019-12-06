/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;
import javax.swing.ImageIcon;
/**
 *
 * @author arbit
 */
public class Alien extends Sprite {
    private Bomb bomb;
    private final String alienImg = "src/Images/alien.png";
    
    public Alien(int x, int y){
    
        initAlien(x,y);
        
    }
    
    private void initAlien(int x,int y){
    this.x =x;
    this.y=y;
    
    bomb = new Bomb(x,y);
    ImageIcon alienImage = new ImageIcon(alienImg);
    setImage(alienImage.getImage());
    }
    public void act(int direction){
    this.x += direction;
    }
    
    public Bomb getBomb(){
    return bomb;
    }
    public class Bomb extends Sprite{
    private final String bombImg = "src/Images/bomb.png";
    private boolean destroyed;

    
    public Bomb(int x, int y){
    initBomb(x,y);
    }
    private void initBomb(int x, int y){
    setDestroyed(true);
    this.x= x;
    this.y = y;
    ImageIcon bombI= new ImageIcon(bombImg);
    setImage(bombI.getImage());
    }
    
    public void setDestroyed(boolean destroyed){
    this.destroyed = destroyed;
    }
    public boolean isDestroyed(){
    return destroyed;
    }
}
}
