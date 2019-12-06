/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package determineleapyear;
import java.util.Scanner;
/**
 *
 * @author arbit
 */
public class DetermineLeapYear {

    /**
     * @param args the command line arguments
     */
        //Name:Gregory Pugh 
        //Assignment: "DetermineLeapYear"
        //Date: May 30,2019
        //Instructor: Ross Lowrance 
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the Year that you want to determine is a leap year or not");
       int userInput = input.nextInt();
       
       if(userInput%4==0&&userInput%100!=0||userInput%400==0){
           System.out.println("Yes " + userInput + " is a leap year");
           //if the year is divisible by 4 and not divisible by 100 or the year is divisible by 400 then the year is a leap year
           
       }
       else{
           System.out.println("No "+userInput+" is not a leap year");
       }
    }
    
}
