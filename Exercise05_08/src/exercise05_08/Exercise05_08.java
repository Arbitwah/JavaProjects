/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise05_08;

import java.util.Scanner;
public class Exercise05_08 {

    //Name:Gregory Pugh
    //Assignment: "Exercise 5.8"
    //Date: June 6,2019
    //Instructor: Ross Lowrance
    //Instructions: (Find the highest score) Write a program that prompts the user to enter the number of students and each student’s name and score, 
    //and finally displays the name of the student with the highest score. Use the next() method in the Scanner class to read a name rather using the nextLine() method.
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double numOfStudents;
    String topStudent="";
    double topScore=0;
    
    System.out.println("Enter the number of students");
    
    numOfStudents = input.nextDouble();
    
    for(double i=0;i<numOfStudents;i++){
        String sName;
        double sNum;
        System.out.println("Enter Student's Name");
        sName= input.next();
        System.out.println("Enter Student's Score");
        sNum = input.nextDouble();
    if(sNum>topScore){
        topScore = sNum;
        topStudent = sName;
    }
        
    }//end of for
        System.out.println(topStudent+" has the top score of "+topScore);
    
    
    }
    
}
