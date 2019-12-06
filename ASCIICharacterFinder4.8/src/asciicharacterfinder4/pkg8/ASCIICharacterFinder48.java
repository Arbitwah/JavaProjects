/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asciicharacterfinder4.pkg8;
import java.util.Scanner;


/**
 *
 * @author arbit
 */
public class ASCIICharacterFinder48 {

    /**
     * @param args the command line arguments
     */
        //Name:Gregory Pugh 
        //Assignment: "Exercise 4.8"
        //Date: June 6,2019
        //Instructor: Ross Lowrance 
        //Instructions: Find the character of an ASCII code) Write a program that 
        //receives an ASCII code (an integer between 0 and 127) and displays its character.
    public static void main(String[] args) {
   System.out.println("Please Enter the ASCII code");
   Scanner input = new Scanner(System.in); 
   int uniCode = input.nextInt();
   char convert = (char)uniCode; //cast the input as a char to convert it to the unicode version
   System.out.println(convert);
   
    
    }
    
}
