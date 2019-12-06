/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise05_07;

/**
 *
 * @author arbit
 */
public class Exercise05_07 {

    //Name:Gregory Pugh
    //Assignment: "Exercise 5.7"
    //Date: June 6,2019
    //Instructor: Ross Lowrance
    //Instructions:(Financial application: compute future tuition)
    //Suppose that the tuition for a university is $10,000
    //this year and increases 5% every year. In one year, the tuition
    //will be $10,500. Write a program that displays the tuition in
    //ten years and the total cost of four years’ worth of tuition after
    //the tenth year.
    public static void main(String[] args) {
        
    double  tuition = 10000;
    double taxRate = 0.05;
    int year = 0;
    double total = 0;


    while(year <= 9 ){
        tuition +=tuition * taxRate;
        year++;
        //used a while loop to get the tuition after ten years. 
    }
        System.out.println("The tuition costs after ten years is $"+tuition);
    for(int i=0; i<4;i++){
        total += tuition;
        tuition+=tuition*taxRate;
        year++;
        //used a for loop to get the total tuition for four years.
    }
        System.out.println("The cost of four years of tuition $"+total);
    }
    
}
