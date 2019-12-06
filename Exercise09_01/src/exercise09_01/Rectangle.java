/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise09_01;

/**
 *
 * @author arbit
 */
public class Rectangle {
    double height=0;
    double width=0;
    Rectangle(){
    //no arg contructor
    }
    
    Rectangle(double newHeight, double newWidth){
    height = newHeight;
    width = newWidth;
    }
    
   public double getPerimeter(){
   return (height *2)+(width*2);  
   }
    
   public  double getArea(){
   return width*height;
   }
    
}
