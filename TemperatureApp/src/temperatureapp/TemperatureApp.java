/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatureapp;
import java.util.Scanner;

/**
 *
 * @author gp0541031
 */
public class TemperatureApp {

    /**
     * @param args the command line arguments
     */
         //Name:Gregory Pugh 
        //Assignment: "Temperature App"
        //Date: May 30,2019
        //Instructor: Ross Lowrance 
    public static void main(String[] args) {
        //Write a program that converts F to C and C to F
        Scanner input = new Scanner(System.in);
        String choice;
        double temp; 
        double changedTemp;
        String orginalType;
        System.out.println("Type the letter you want to convert the temperature to (c) for Celsius or (f) for Fahrenheit");
        //prompts the user for a letter input see which conversion formula will need to be used
        choice = input.nextLine().toUpperCase();
        //the variable choice holds the users input as an uppercase. 
        System.out.println("Now type the temperature you want to convert");
        //prompts the user for value to convert
        temp = input.nextDouble();
        //stores the users input as a double in the variable temp
        
        if(choice.equals("C")){
            changedTemp = (temp-32)*5.0/9;
            orginalType="F";
            //if the user input C then we use this if statement to convert the value
        }
        else if (choice.equals("F")){
            changedTemp = (temp*9.0/5)+32;
            orginalType="C";
             //if the user input F then we use this if statement to convert the value
        }
        else{
           orginalType="Failed";
           changedTemp = 0;
           //if the input was not valid the value failed is passed and changedTemp is set to 0
        }
        
       if(orginalType.equals("Failed")){
        System.out.println("Invalid input was recived");
    }
       else{
         System.out.println("The converted temperature is " +Math.round(changedTemp*100.0)/100.0+" "+ choice + ", the orginal temperature was " +temp+" "+orginalType);
       }
    }
}
