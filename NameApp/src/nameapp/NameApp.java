/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nameapp;
import java.util.Scanner; //Scanner is in the java.util package

/**
 *
 * @author gp0541031
 */
public class NameApp {

    /**
     * @param args the command line arguments
     */ 
        //Name:Gregory Pugh 
        //Assignment: "NameApp"
        //Date: May 30,2019
        //Instructor: Ross Lowrance 
    public static void main(String[] args) {
    String name;    
    Scanner input = new Scanner(System.in);
    System.out.print("What is your name ");
    name = input.next();
    System.out.print("It is nice to meet you, " + name +"\n" );
    //ask the user for their name then tells them Nice to meet you using their name. 
    }
    
}
