package com.stackroute.pe1;
/*9. Write a program to reverse any string without using String Buffer. Input : london Output : nodnol */
import java.util.Scanner;

public class Reversestring
{



   public static  String stringReverse(String stringtobereversed)
    {



        String reversedstring = "";


        for(int i = stringtobereversed.length() - 1; i >= 0; i--)
        {
            reversedstring= reversedstring + stringtobereversed.charAt(i); //string is concatenated from the last
        }

        return reversedstring;//reverse string is inputted
    }
}
