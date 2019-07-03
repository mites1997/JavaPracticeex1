package com.stackroute.pe1;

/* Write a program which accepts an integer number as input from the user and
perform the following conditional checks: a. Print Tom if number is odd and exists between 20 to 30 b. Print Jerry,
 if number is even and exists between 20 and 30
* */

import java.util.Scanner;

public class Checkoddeven
{

  public static String oddeven(int input) {
        String output="";
	if(input<0)
	output=output+"invalid input";


        if ((input % 2 == 0) && (input > 20) && (input < 30)) {   //required conditions checked

            output=output+"Tom";
        } else if ((input % 2 != 0) && (input> 20) && (input < 30)) {


            output=output+"Jerry";


        }
        return output;
    }

}
