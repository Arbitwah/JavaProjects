/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ssncheckapp;
import java.util.Scanner;


/**
 *
 * @author arbit
 */
public class SSNCheckApp {

    /**
     * @param args the command line arguments
     */
        //Name:Gregory Pugh 
        //Assignment: "Exercise 4.21"
        //Date: June 6,2019
        //Instructor: Ross Lowrance 
        //Instructions: Write a program that prompts the user to enter a Social Security number in the format DDD-DD-DDDD, 
        //where D is a digit. Your program should check whether the input is valid. 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter a Social Security Number Below\n");
        String ssnNum = input.nextLine();
        
       if(ssnNum.matches("^\\d{3}-\\d{2}-\\d{4}$")){
           System.out.println(ssnNum+" is valid");
       }
       else{
           System.out.println(ssnNum+" is not valid");
       }
    }
    
}
