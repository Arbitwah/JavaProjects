/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hextobinary;
import java.util.Scanner;


/**
 *
 * @author arbit
 */
public class HextoBinary {

    /**
     * @param args the command line arguments
     */
        //Name:Gregory Pugh 
        //Assignment: "4.12 Hex to Binary"
        //Date: June 6,2019
        //Instructor: Ross Lowrance
        //(Hex to binary) Write a program that prompts the user to enter a hex digit and displays 
        //its corresponding binary number. For an incorrect input, display invalid input
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex character: \n");
        char hex = input.nextLine().charAt(0);
        
        String result = "";
        
        switch(hex){
            case '0': result = "0000";
            break;
            case '1': result = "0001";
            break;
            case '2': result = "0010";
            break;
            case '3': result = "0011";
            break;
            case '4': result = "0100";
            break;
            case '5': result = "0101";
            break;
            case '6': result = "0110";
            break;
            case '7': result = "0111";
            break;
            case '8': result = "1000";
            break;
            case '9': result = "1001";
            break;
            case 'A': result = "1010";
            break;
            case 'B': result = "1011";
            break;
            case 'C': result = "1100";
            break;
            case 'D': result = "1101";
            break;
            case 'E': result = "1110";
            break;
            case 'F': result = "1111";
            break;
            default: System.out.print(hex + " is an invalid input\n");
        }
        if(!result.equals(""))
        System.out.print("The binary value of "+hex+" is "+result+"\n" );
    }
    
}
