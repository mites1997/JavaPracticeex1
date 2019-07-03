package com.stackroute.pe1;

/*Write a program which accepts a number as input and check whether the given number is palindrome or not If it is a palindrome then a. Add all the even numbers and check whether the sum is more than 25. b. Print success and failure messages for all 3 conditions Input : 2468642
Output : 2468642 is palindrome and the sum of even numbers is greater than 25
Input: 12345
Output: 12345 is not palindrome
Input: 12345654321
Output : 12345654321 is palindrome and sum of even numbers is less than 25
*/
import java.util.Scanner;

public class Palindromecheck {


    public static String palindromecheck(long numtocheck) {
        String output="";
        if(numtocheck<0)
            return "wrong input";

        long sumtomakepalindrome = 0;
        long sumevendigits = 0;
        long temp = numtocheck;

        while (numtocheck > 0) { //number is reversed
            long r = numtocheck % 10;
            if (r % 2 == 0) {
                sumevendigits = sumevendigits + r;

            }
            sumtomakepalindrome = sumtomakepalindrome * 10 + r;
            numtocheck = numtocheck / 10;


        }
        if (sumtomakepalindrome == temp) { //conditions checked if the number is palindrome and sum is greater than or less than 25
            output=output+"palindrome";

            {
            if (sumevendigits > 25) {

                output=output+"greater than 25";
            } else {

                output=output+"smaller than 25";
            }

        }
        }
        else
            {
            output=output+"not palindrome";

        }
        return output;


}
}

