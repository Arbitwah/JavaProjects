/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise05_17;
import java.util.Scanner;
    //Name:Gregory Pugh
    //Assignment: "Exercise 5.14"
    //Date: June 6,2019
    //Instructor: Ross Lowrance
    //Instructions: (Display pyramid) Write a program that prompts the user to enter an integer from 1 to 15 and displays a pyramid, as shown in the following sample run:

public class Exercise05_17 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer from 1 to 15:");
        int pyLen = input.nextInt()+1;
             System.out.println("");
        //doubled the input since we are skipping even rows
        for(int i=0;i<pyLen;++i){
            for(int k = (pyLen-i)*2;k>1;k--){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){ //builds left half of the pyramid from 1
                System.out.print(j+" ");
            }
            for(int j=2;j<=i;j++){//builds right half of the pyramid from 1
                System.out.print(j+" ");
            }
           
            System.out.println("");//goes to the next line
            
         
        }//end of first for
    }
    
}
