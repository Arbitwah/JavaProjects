/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chinese.zodiac;
import java.util.Scanner;
/**
 *
 * @author arbit
 */
public class ChineseZodiac {

    /**
     * @param args the command line arguments
     */
        //Name:Gregory Pugh 
        //Assignment: "Chinese Zodiac"
        //Date: May 30,2019
        //Instructor: Ross Lowrance 
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);  
    String animal = "";
    System.out.println("Please enter the Year");
    int userInput = input.nextInt();
    //below is a switch statement it will determine if the year is divisible by 12. 
    //the remainder, if there is any will equate to the animal for that year. 
    switch(userInput%12){
        case 0: 
            animal = "Monkey";
            break;
        case 1:
            animal = "Rooster";
            break;
        case 2:
            animal = "Dog";
            break;
        case 3: 
            animal = "Pig";
            break;
        case 4:
            animal ="Rat";
            break;
        case 5:
            animal ="Ox";
            break;
        case 6:
            animal = "Tiger";
            break;
        case 7:
            animal ="Rabbit";
            break;
        case 8:
            animal = "Dragon";
            break;
        case 9:
            animal = "Snake";
            break;
        case 10:
            animal = "Horse";
            break;
        case 11:
            animal = "Sheep";
            break;
    }
    System.out.println("The year you entered "+userInput+" is the year of the "+animal);
    }
    
}
