package com.stackroute.pe1;
/* Write a program for the following condition: Given 2 inputs , where input1 is string and input 2 is integer value,
 the last n characters should repeat n number of times in the output String.
Input1: Stackroute
Input2: 5
Output1: Stackrouterouterouterouterouteroute
Input1: Stackroute
Input2: 2
Output1: Stackroutetete
*/
import java.util.Scanner;

public class Stringlastncharacters
{



   public static String stringLastChar(String originalstring,int numberofcharstorepeat) {



        String x=originalstring.substring(originalstring.length()-numberofcharstorepeat); //substring is extracted
        for(int i=0;i<numberofcharstorepeat;i++)
        {
            originalstring=originalstring.concat(x); //substring is concatenated to the original

        }
        return originalstring;

    }
}
