/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderthreecities;
import java.util.Scanner;


/**
 *
 * @author arbit
 */
public class OrderThreeCities {

    //Name:Gregory Pugh 
    //Assignment: "Exercise 4.24"
    //Date: June 6,2019
    //Instructor: Ross Lowrance 
    //Instructions: Write a program that prompts the user to enter 
    //three cities and displays them in ascending order. 
    public static void main(String[] args) {
        String city1; 
        String city2;
        String city3;
        Scanner input = new Scanner(System.in);
        System.out.println("This program takes three city names and returns them in ascending order\n");
        System.out.println("Enter the city name below: \n");
        city1 = input.nextLine();
        System.out.println("Enter the city name below: \n");
        city2 = input.nextLine();
        System.out.println("Enter the city name below: \n");
        city3 = input.nextLine();
       if(city1.compareToIgnoreCase(city2)<0 && city1.compareToIgnoreCase(city3)<0 &&city2.compareToIgnoreCase(city3)<0||
               city1.equalsIgnoreCase(city2)&&city1.equalsIgnoreCase(city3)||
               city1.equalsIgnoreCase(city2)&&city1.compareToIgnoreCase(city3)<0){
           System.out.println(city1+" "+city2+" "+city3);
           //This if statment compares each input regarless of case and prints this statment if input 1, 2 and 3 where already aphabiltical, 
           //or if they all equal each other, or if they are repeats and alphabetical
        }
       if(city2.compareToIgnoreCase(city1)<0 && city2.compareToIgnoreCase(city3)<0 && city1.compareToIgnoreCase(city3)<0||city2.equalsIgnoreCase(city1)&&city2.compareTo(city3)<0){
           System.out.println("The towns in alphabetical order are "+city2+" "+city1+" "+city3);
           //This if statement will check to see if 2 is alphabetically before 1 and 3 and if 2 and 1 are eqaul and alphebetically before 3
       }
       if(city3.compareTo(city1)<0&&city3.compareTo(city2)<0&&city1.compareTo(city2)<0||city3.equalsIgnoreCase(city1)&&city3.compareToIgnoreCase(city2)<0){
           System.out.println("The towns in alphabetical order are "+city3+" "+city1+" "+city2);
           //This if statement will check if 3 is alphebetically before 1 and 2, and will check if 3 equals 1 and is before 2
       } 
       else{
           System.out.println("The towns in alphabetical order are "+city3+" "+city2+" "+city1);
           //this should handle all combinations if not let me know and I will fix it.
           //I wrote this while sitting in a hospital lobby that was noisy. 
       }
              
        
    }
    
}
