//Name:Gregory Pugh
//Assignment: "Exercise 9.06
//Date: June 18,2019
//Instructor:(Stopwatch) Design a class named StopWatch. The class contains:
//• Private data fields startTime and endTime with getter methods.
//• A no-arg constructor that initializes startTime with the current time.
//• A method named start() that resets the startTime to the current time.
//• A method named stop() that sets the endTime to the current time.
//• A method named getElapsedTime() that returns the elapsed time for the stopwatch in milliseconds.
//Draw the UML diagram for the class and then implement the class. Write a test program that 
//measures the execution time of sorting 100,000 numbers using selection sort.

package exercise09_06;
import java.util.Arrays;
import java.util.Random;



public class Exercise09_06 {

       public static void main(String[] args) 
       {
           StopWatch watch = new StopWatch(); //intializing the watch
           int[] array = createArray(); //creating the array
          
          watch.start();//start the clock
          sortArray(array);//sort the array
          watch.stop();//stop the clock
          
           System.out.println("The time it took to sort this array was "+watch.getElapsedTime()+" milliseconds");
           watch.start();
           slowSort(array);
           watch.stop();
            System.out.println("The time it took to sort this array was "+watch.getElapsedTime()+" milliseconds");
        
       }
       public static int[] createArray()
       {
            Random ran = new Random();
            int[] number = new int[100000];
            for(int i = 0;i<number.length;i++){
            number[i] =ran.nextInt(100000);
            }
            return number;
       }
       public static void sortArray(int[] array){
       Arrays.sort(array);
//       for(int ar:array){
//           System.out.println(ar);
//       }
       }
       public static void slowSort(int[] array){
           for(int i =0;i<array.length-1;i++){
               int min = array[i]; //sets default min value
               int minIdx = i;  //sets default min value
                    for(int k = i+1;k<array.length;k++){
                        if(array[k]<min){ //test value in array to see if it is the smaller than the minimum
                        min = array[k]; //if the value was smaller it now becomes the new minimum
                        minIdx = k; //marks the index where the value is
                        }
                    }
                    if(i!=minIdx){ //if the minimum value is not at i 
                    array[minIdx]= array[i]; //sets the value at index to i
                    array[i] = min; // changes the value at i to the min value
                    }
           }
       }
}
