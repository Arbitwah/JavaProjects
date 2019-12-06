/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise05_14;
import java.util.Scanner;
    //Name:Gregory Pugh
    //Assignment: "Exercise 5.14"
    //Date: June 6,2019
    //Instructor: Ross Lowrance
    //Instructions:(Compute the greatest common divisor) Another solution for Listing 5.9 
    //GreatestCommonDivisor.java GreatestCommonDivisor.java to find the greatest common divisor of two integers n1 and n2 is as follows: 
    //First find d to be the minimum of n1 and n2, then check whether d, d-1, d-2, ..., 2, or 1 is a divisor for both n1 and n2 in this order. 
    //The first such common divisor is the greatest common divisor for n1 and n2. Write a program that prompts the user to enter two positive integers and displays the gcd.
public class Exercise05_14 {

    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter first Integer: ");
        int num1 = input.nextInt();
        System.out.println("Enter second Integer: ");
        int num2 = input.nextInt();
        
        int gcd =1;
        int ncd= 2;
        
        while(ncd<=num1 && ncd<=num2){
            if(num1%ncd==0 && num2%ncd==0){
                 gcd = ncd;
            }
            ncd++;
        }
        
        System.out.println("The greatest common divisor for "+num1+" and "+num2+" is "+gcd);
    }
    
}
