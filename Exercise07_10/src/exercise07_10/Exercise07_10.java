/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise07_10;
import java.util.Scanner;
//Name:Gregory Pugh
//Assignment: "Exercise 7.01
//Date: June 18,2019
//Instructor: Ross Lowrance
//Instructions:(Find the index of the smallest element) Write a method that returns the index of the smallest element in an array of integers. If the number of such elements is greater than 1, return the smallest index. Use the following header:

//3. public static int indexOfSmallestElement(double[] array)
//Write a test program that prompts the user to enter ten numbers, invokes this method to return the in//dex of the smallest element, and displays the index.
public class Exercise07_10 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter ten numbers :");
        double[] num = new double[10];
        for(int i =0;i<num.length;i++){
           num[i]=input.nextDouble();
        }
        System.out.println("The index of the smallest number is "+indexOfSmallestElement(num));
    }
    public static int indexOfSmallestElement(double[] array){
    double min = array[0];
    int sElement = 0;
    for(int i=0;i<array.length;i++){
        if(array[i]<min){
        min = array[i];
        sElement = i;
        }
    }
    
    return sElement;
    }
    
}
