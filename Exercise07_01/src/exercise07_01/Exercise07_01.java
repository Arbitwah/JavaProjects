/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise07_01;
import java.util.Scanner;

//Name:Gregory Pugh
//Assignment: "Exercise 7.01
//Date: June 18,2019
//Instructor: Ross Lowrance
//Instructions: 7.1: (Assign grades) Write a program that reads student scores, gets the best score, and then assigns grades based on the following scheme:
//	• Grade is A if score is ≥ best − 10
//	• Grade is B if score is ≥ best − 20;
//	• Grade is C if score is ≥ best − 30;
//	• Grade is D if score is ≥ best − 40;
//	• Grade is F otherwise.
//The program prompts the user to enter the total number of students, then prompts the user to enter //all of the scores, and concludes by displaying the grades. 
public class Exercise07_01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of students");
        int numOfStudents = input.nextInt(); 
        System.out.println("Enter " +numOfStudents+ " scores");
        double[] students =new double[numOfStudents];
        for(int i = 0;i<numOfStudents;i++){
        students[i] = input.nextDouble();
        }
        double best = findBest(students);
        for(int i = 0;i<students.length;i++){
            System.out.println("Student "+i+" score is "+students[i]+" and grade is "+getGrade(students[i],best));
        }
     
    }
    
    public static double findBest(double[] students){
    double max=0;
    for(int i =0; i<students.length;i++){
        if(students[i]>max){
        max = students[i];
        }
    }
    return max;
    }
    
    public static char getGrade(double student, double best){
        char grade = '-';
            if(student>=best-10){
                 grade = 'A';
            }
           else if(student>=best-20){
                 grade = 'B';
            }
           else if(student>=best-30){
                 grade = 'C';
            }
           else if(student>=best-40){
                 grade = 'D';
            }
            else{
                grade = 'F';
            }
        return grade;
    }
    
}
