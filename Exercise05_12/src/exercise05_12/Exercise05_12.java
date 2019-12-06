/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise05_12;


public class Exercise05_12 {
    //Name:Gregory Pugh
    //Assignment: "Exercise 5.12"
    //Date: June 6,2019
    //Instructor: Ross Lowrance
    //Instructions: (Find the smallest n such that n2 > 12,000) 
    //Use a while loop to find the smallest integer n such that n2 is greater than 12,000.

    public static void main(String[] args) {
        double n = 0; 
        System.out.println("This program will find the lowest number squared that is greater than 12,000");
        while(Math.pow(n,2)<12000){
        n++;
        }
            System.out.println(n+" is the smallest integer squared that equals 12,000");
            System.out.println(n+" squared eqauls out to "+Math.pow(n,2));
        
    }
    
}
