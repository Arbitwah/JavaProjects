/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise06_31;
import java.util.Scanner;
//Name:Gregory Pugh
//Assignment: "Exercise 6.31
//Date: June 18,2019
//Instructor: Ross Lowrance
//Instructions:Financial: credit card number validation) Credit card numbers follow certain patterns. A credit card number must have between 13 and 16 digits. It must start with:
//4 for Visa cards
//5 for Master cards
//37 for American Express cards
//6 for Discover cards
//In 1954, Hans Luhn of IBM proposed an algorithm for validating credit card numbers. The algorithm is useful to determine whether a card number is entered 
//correctly or whether a credit card is scanned correctly by a scanner. Credit card numbers are generated following this validity check, commonly known as the Luhn check or the Mod 10 check, 
//which can be described as follows (for illustration, consider the card number 4388576018402626):
//Double every second digit from right to left. If doubling of a digit results in a two-digit number, add up the two digits to get a single-digit number.
//Now add all single-digit numbers from Step 1.
//4 + 4 + 8 + 2 + 3 + 1 + 7 + 8 = 37
// Add all digits in the odd places from right to left in the card number.
//6 + 6 + 0 + 8 + 0 + 7 + 8 + 3 = 38
//Sum the results from Step 2 and Step 3.
//37 + 38 = 75
// If the result from Step 4 is divisible by 10, the card number is valid; otherwise, it is invalid. For example, the number 4388576018402626 is invalid, but the number 4388576018410707 is valid.
//Write a program that prompts the user to enter a credit card number as a long integer. Display whether the number is valid or invalid. Design your program to use the following methods:
//17. /** Return true if the card number is valid */
//18. public static boolean isValid(long number)
//19. /** Get the result from Step 2 */
//20. public static int sumOfDoubleEvenPlace(long number)
//21. /** Return this number if it is a single digit, otherwise,
//22. * return the sum of the two digits */
//23. public static int getDigit(int number)
//24. /** Return sum of odd-place digits in number */
//25. public static int sumOfOddPlace(long number)
//26. /** Return true if the number d is a prefix for number */
//27. public static boolean prefixMatched(long number, int d)
//28. /** Return the number of digits in d */
//29. public static int getSize(long d)
//30. /** Return the first k number of digits from number. If the
//31. * number of digits in number is less than k, return number. */
//public static long getPrefix(long number, int k)
public class Exercise06_31 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a credit card number as a long integer: ");
        long credit = input.nextLong();
        System.out.println(
                credit+" is "+ (isValid(credit) ? "valid": "invalid"));//Tenary in java 
        
      
        
    }
    
    public static boolean isValid(long number){
        int cardLength = getSize(number);
        boolean valid = 
                (getSize(number)>=13&&getSize(number)<=16)&&//returns true if size is with 13 to 16 numbers
                (prefixMatched(number,4)||prefixMatched(number,5)||//returns true if matched
                prefixMatched(number,6)||prefixMatched(number,32))&&//returns true if matched
                (((sumOfDoubleEvenPlace(number)+ sumOfOddPlace(number))%10==0));//returns true if divisible by 10
    return valid;
    }
    
    public static int  sumOfDoubleEvenPlace(long number){
      String  cardNum = number+"";
      int sum = 0;
      for(int i =getSize(number)-2;i>=0;i-=2){//move away from modulo approach was getting the wrong even number for test case
           sum+= getDigit(Integer.parseInt(cardNum.charAt(i)+"")*2);
      }
      return sum;
    }
    
    public static int getDigit(int number){
        if(number<9){
        return number;
        }
        return number/10 + number%10;
    }
    
    public static int sumOfOddPlace(long number){
      String  cardNum = number+"";
      int sum = 0;
      for(int i =getSize(number)-1;i>=0;i-=2){//moved away from modulo was getting wrong odd number during test case
            sum+= Integer.parseInt(cardNum.charAt(i)+"");
      }
      return sum;
    }
    
    public static boolean prefixMatched(long number,int d){
        return getPrefix(number,getSize(d))==d;//will true if for example 4 == 4 or 32 == 32
    }
    
    public static int getSize(long number){
    String cardNum = number+"";
    return cardNum.length();
    }
    
    public static long getPrefix(long number, int k){
    if(getSize(number)>k){
        String cardNum = number+"";
        return Long.parseLong(cardNum.substring(0,k));//took me awhile to figure out why the hell he wanted to return a long number...
    }
    return number;
    }
    
}
