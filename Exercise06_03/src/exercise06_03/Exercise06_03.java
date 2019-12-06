/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise06_03;
import java.util.Scanner;
    //Name:Gregory Pugh
    //Assignment: "Exercise 6.03"
    //Date: June 6,2019
    //Instructor: Ross Lowrance
    //Instructions:(Palindrome integer) Write the methods with the following headers:
    // Return the reversal of an integer, e.g., reverse(456) returns 654
    //public static int reverse(int number)
    // Return true if number is a palindrome
    // public static boolean isPalindrome(int number)
    //Use the reverse method to implement isPalindrome. A number is a palindrome if its reversal is the same as itself. 
    //Write a test program that prompts the user to enter an integer and reports whether the integer is a palindrome.
public class Exercise06_03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Integer: ");
        int num = input.nextInt();
        boolean outcome = isPalidrome(num);
        if(outcome == true){
            System.out.println(num+" is a palindrome");
        }
        else{
            System.out.println(num+" is not a palindrome");
        }
        
        
    }
    public static int reverse(int num){
      int revNum=0; //reversed number starts at 0
      while(num!=0){//runs until num = 0
      int lastDig = num%10; //cuts off the last digit of the number
      revNum = revNum *10 +lastDig;//previous last digit is added onto the reversed number in the correct position.
      num/=10;
      }
       return revNum;
    }
    public static boolean isPalidrome(int num)
    {
        //decided to use the same variable for simplicity and to demonstrate that each method is using local variables and passed in variables. Nothing being done globally. 
        int revNum = reverse(num);//makes a call to reverse() to get the reversed num for testing. 
            if(num==revNum)
            {
                return true;
            }
            else
           {
            return false;
             }
    
    }
    
}
