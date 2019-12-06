/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise07_08;
import java.util.Scanner;
//Name:Gregory Pugh
//Assignment: "Exercise 7.01
//Date: June 18,2019
//Instructor: Ross Lowrance
//Instructions:(Average an array) Write two overloaded methods that return the average of an array with the following headers:

//1. public static int average(int[] array)
//2. public static double average(double[] array)
//Write a test program that prompts the user to enter ten double values, invokes this method, and displays the average value.

public class Exercise07_08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 integers: ");
        double[] num = new double[10];
        for(int i=0;i<10;i++){
        num[i] = input.nextDouble();
        }
        System.out.printf("The average for integers is "+ average(num)+"%n");
        System.out.println("Enter 10 double values: ");
        for(int i=0;i<10;i++){
        num[i]=input.nextDouble();
        }
        System.out.println("The average for double values is "+average(num));
    }
    
    public static int average(int[] array){
        int sum =0;
        for(int i =0; i<array.length;i++){
        sum+=array[i];
        }
    return sum/array.length;
    }
    
    public static double average(double[] array){
     double sum=0;
     for(int i =0;i<array.length;i++){
        sum+=array[i];
     }
     return sum/array.length;
    }
    
}
