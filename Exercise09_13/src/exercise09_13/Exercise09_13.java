//Name:Gregory Pugh
//Assignment: "Exercise 9.13
//Date: June 18,2019
//Instructor:(The Location class) Design a class named Location for locating a maximal value and its location in a two-dimensional array. 
//The class contains public data fields row, column, and maxValuethat store the maximal value and its indices in a two-dimensional array with row and column as int types and maxValue as a double type.
//Write the following method that returns the location of the largest element in a two-dimensional array:
//1. public static Location locateLargest(double[][] a)
//The return value is an instance of Location. Write a test program that prompts the user to enter a two-dimensional array and displays the location of the largest element in the array.

package exercise09_13;
import java.util.Scanner;
public class Exercise09_13 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in the array.");
        System.out.println("Enter rows:");
        int row = input.nextInt();
        System.out.println("Enter Columns");
        int column = input.nextInt();
        
        double[][] array = new double[row][column];
        System.out.println("Enter the values into the array");
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                array[i][j]=input.nextDouble();
            }
        }
        Location locate = new Location(array);
        System.out.println(locate.column);
        System.out.println("The location of the largest element is " +locate.maxValue+ " at ( "+locate.row+","+locate.column+" )");
    }    
}
