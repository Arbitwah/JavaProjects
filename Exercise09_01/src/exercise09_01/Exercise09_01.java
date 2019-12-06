/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise09_01;

//Name:Gregory Pugh
//Assignment: "Exercise 9.01
//Date: June 18,2019
//Instructor:(The Rectangle class) Following the example of the Circleclass in Section 9.2, design a class named Rectangle to represent a rectangle. The class contains:
//• Two double data fields named width and height that specify the width and height of the rectangle. The default values are 1for both width and height.
//• A no-arg constructor that creates a default rectangle.
//• A constructor that creates a rectangle with the specified widthand height.
//• A method named getArea() that returns the area of this rectangle.
//• A method named getPerimeter() that returns the perimeter.
//Draw the UML diagram for the class and then implement the class. Write a test program that creates two Rectangle objects-one with width 4 and height 40 and
//the other with width 3.5 and height 35.9. Display the width, height, area, and perimeter of each rectangle in this order.

public class Exercise09_01 {

    
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(40,4);
        Rectangle rectangle2 = new Rectangle(35.9,2.5);
        System.out.printf("%1s%10s%10s%10s%15s%n","Rectangle","Width","Height","Area","Perimeter");
        System.out.printf("%1s%16.0f%10.0f%10.0f%15.0f%n","one",rectangle1.width,rectangle1.height,rectangle1.getArea(),rectangle1.getPerimeter());
        System.out.printf("%1s%16.1f%10.1f%10.2f%15.1f%n","two",rectangle2.width,rectangle2.height,rectangle2.getArea(),rectangle2.getPerimeter());
    }
    
}
