/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vowelorconsanant;
import java.util.Scanner;


public class VowelOrConsanant {

    /**
     * @param args the command line arguments
     */
        //Name:Gregory Pugh 
        //Assignment: "Exercise 4.13"
        //Date: June 6,2019
        //Instructor: Ross Lowrance
        //Instructions: Write a program that prompts the user to enter a letter and check whether the letter is a 
        //vowel or consonant. For a non-letter input, display invalid input.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter to be tested: \n");
        String userInput = (String)input.nextLine();
        
        if(userInput.equalsIgnoreCase("A")||userInput.equalsIgnoreCase("E")||userInput.equalsIgnoreCase("I")||userInput.equalsIgnoreCase("O")||userInput.equalsIgnoreCase("U")){
            System.out.print(userInput+" is a vowel.\n");
        }
        else if(userInput.equalsIgnoreCase("Y")){
            System.out.print(userInput+" is a vowel when it is by itself.\n");
        }
        else{
            System.out.print(userInput+" is a constant.\n");
        }
        
    }
    
}
