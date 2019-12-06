/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise06_21;
import java.util.Scanner;
    //Name:Gregory Pugh
    //Assignment: "Exercise 6.08"
    //Date: June 18,2019
    //Instructor: Ross Lowrance
    //Instructions: (Phone keypads) The international standard letter/number mapping for telephones is shown in Programming Exercise 4.15. Write a method that returns a number, given an uppercase letter, as follows:
    //11. public static int getNumber(char uppercaseLetter)
    //Write a test program that prompts the user to enter a phone number as a string. The input number may contain letters. 
    //The program translates a letter (uppercase or lowercase) to a digit and leaves all other characters intact.
public class Exercise06_21 {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Phone Number the number may contain letters: ");
        String testNum = input.next();
        String newNum = "";
        for(int i = 0; i<testNum.length();i++){
           if(testNum.charAt(i)=='-'){
           newNum += testNum.charAt(i);
           }
           else if(testNum.charAt(i)!='-'){
                    if(Character.isLetter(testNum.charAt(i))==true){
                        newNum += getNumber(Character.toLowerCase(testNum.charAt(i)));
                     }
                    else{
                        newNum += testNum.charAt(i);
                    }
           }

           
        }
        System.out.println(testNum+" is translated to "+newNum);
    }
    
    public static int getNumber(char letter){//2abc 3def 4ghi  5jkl 6mno 7pqrs 8tuv 9wxyz
        int number=0;
        if(letter <= 'c'){
        number = 2;
        }
        if(letter>'c'&&letter<='f'){
        number = 3;
        }
        if(letter>'f'&&letter<='i'){
        number=4;
        }
        if(letter>'i'&&letter<='l'){
        number=5;
        }
        if(letter>'l'&&letter<='o'){
        number=6;
        }
        if(letter>'o'&&letter<='s'){
        number=7;
        }
        if(letter>'s'&&letter<='v'){
        number=8;
        }
        if(letter>'v'&&letter<='z'){
        number=9;
        }
        return number;
        }
    
    }

