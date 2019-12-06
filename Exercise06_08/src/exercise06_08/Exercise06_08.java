/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise06_08;

    //Name:Gregory Pugh
    //Assignment: "Exercise 6.08"
    //Date: June 18,2019
    //Instructor: Ross Lowrance
    //Instructions: (Conversions between Celsius and Fahrenheit) Write a class that contains the 
    //following two methods:
    //5. /** Convert from Celsius to Fahrenheit */
    //6. public static double celsiusToFahrenheit(double celsius)
    //7. /** Convert from Fahrenheit to Celsius */
    //8. public static double fahrenheitToCelsius(double fahrenheit)
    //The formula for the conversion is:
    //9. fahrenheit = (9.0 / 5) * celsius + 32
    //10. celsius = (5.0 / 9) * (fahrenheit - 32)
    //Write a test program that invokes these methods to display the following tables:

public class Exercise06_08 {

    public static void main(String[] args) {
        System.out.printf("%-15s %10s | %-15s %10s %n","Celcius","Fahrenheit","Fahrenheit","Celsius");
        System.out.printf("-------------------------------------------------------%n");
        double celsius = 40;
        double fahrenheit = 120;
        for(int i=0;i<10;i++){
        double celFah= celsiusToFahrenheit(celsius);
        double fahCel = fahrenheitToCelsius(fahrenheit);
        System.out.printf("%-15.1f %10.1f | %-15.2f %10.2f %n",celsius,celFah,fahrenheit,fahCel);
        celsius--;
        fahrenheit = fahrenheit -10;
        
        }
    }
    
    public static double celsiusToFahrenheit(double celsius){
       double fahrenheit;
       fahrenheit = (9.0/5)*celsius+32;
       
       return fahrenheit;
    }
    
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius;
        celsius=(5.0/9)*(fahrenheit-32);
        
        return celsius;
    }
    
}
