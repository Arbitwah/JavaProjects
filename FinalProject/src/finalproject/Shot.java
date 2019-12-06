/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;
import javax.swing.ImageIcon;
public class Shot extends Sprite {
    private final String shotImg = "src/Images/shot.png";
    private final int H_SPACE =12;
    private final int V_SPACE = 2;
    
    public Shot(){
    }
    
    public Shot(int x, int y){
    initShot(x,y);
    }
    
    private void initShot(int x, int y){
    ImageIcon shotI = new ImageIcon(shotImg);
    setImage(shotI.getImage());
    setX(x+H_SPACE);
    setY(y-V_SPACE);
    }
}
