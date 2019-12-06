/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessbday;
import java.util.Scanner;

/**
 *
 * @author arbit
 */
public class GuessBday {

    /**
     * @param args the command line arguments
     */
        //Name:Gregory Pugh 
        //Assignment: "4.10 Guess Birthday"
        //Date: June 6,2019
        //Instructor: Ross Lowrance 
        //(Guess birthday) Rewrite Listing 4.3 GuessBirthday.java to prompt 
        //the user to enter the character Y for Yes and N for No rather than entering 1 
        //for Yes and 0 for No.
    public static void main(String[] args) {
       String set1=
               " 1 3 5 7\n" +
               " 9 11 13 15\n" +
               "17 19 21 23\n" +
               "25 27 29 31";
       String set2 =
               " 2  3  6  7\n" +
               "10 11 14 15\n" +
               "18 19 22 23\n" +
               "26 27 30 31";

       String set3 =
               " 4  5  6  7\n" +
               "12 13 14 15\n" +
               "20 21 22 23\n" +
               "28 29 30 31";

        String set4 =
               " 8  9 10 11\n" +
               "12 13 14 15\n" +
               "24 25 26 27\n" +
               "28 29 30 31";

        String set5 =
               "16 17 18 19\n" +
               "20 21 22 23\n" +
               "24 25 26 27\n" +
               "28 29 30 31";
        int day = 0; 
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Is your brithday in Set1\n");
        System.out.print(set1);
        System.out.print("\nEnter Yes or No: ");
        String answer = input.nextLine().toLowerCase();
        
        if(answer.equals("yes")||answer.equals("y")){
            day += 1;
        }
        System.out.print("Is your brithday in Set2\n");
        System.out.print(set2);
        System.out.print("\nEnter Yes or No: ");
        answer = input.nextLine().toLowerCase();
        
        if(answer.equals("yes")||answer.equals("y")){
            day +=2;    
        }
        System.out.print("Is your brithday in Set3\n");
        System.out.print(set3);
        System.out.print("\nEnter Yes or No: ");
        answer = input.nextLine().toLowerCase();
        
        if(answer.equals("yes")||answer.equals("y")){
            day +=4;
        }
             
        System.out.print("Is your brithday in Set4\n");
        System.out.print(set4);
        System.out.print("\nEnter Yes or No: ");
        answer = input.nextLine().toLowerCase();
        
        if(answer.equals("yes")||answer.equals("y")){
           day +=8;
        }
              
        System.out.print("Is your brithday in Set5\n");
        System.out.print(set5);
        System.out.print("\nEnter Yes or No: ");
        answer = input.nextLine().toLowerCase();
             
        if(answer.equals("yes")||answer.equals("y")){
        day+=16;
        }
        
        System.out.println("\nYour birthday is "+day+"!");
        
       
    }
    
}
