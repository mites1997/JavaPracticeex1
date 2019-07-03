package com.stackroute.pe1;
/*5. Write a program that reads an unspecified number of integer arguments using Scanner Class and adds them together.
The program should display total of the given input number and should only consider integer value.
The program should display an error message if there are any non integer values Input : 12 23 2 4 Output : 41 */

import java.util.Scanner;

public class Inputnumber
{



   public static String numberinputcheck(String listOfNum)

    {


        String[] listOfNum1 = listOfNum.split(" ");//string is split to string array
        int sumofnumbers = 0, k = 0;
        for (int i = 0; i < listOfNum1.length; i++) {    //conditions to check if the string has letter or special character
            if (Character.isLetter(listOfNum1[i].charAt(0))) {
                k=1;
               return("character found");

            } else if (listOfNum1[i].charAt(0) >= '0' && listOfNum1[i].charAt(0) <= '9') {
                sumofnumbers = sumofnumbers + Integer.parseInt(listOfNum1[i]);

            } else {
                k = 1;
               return("special character");

            }
        }
        if (k == 0)
           return ("sum is"+sumofnumbers);
        else
            return null;
    }
}
