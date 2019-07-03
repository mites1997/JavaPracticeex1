package com.stackroute.pe1;

/*4. Write a program using a loop to print the following output. 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6 6 6 . . . nth iteration.
Input: 5 Output : 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5
*/
import java.util.Scanner;

public class Numberpattern {



   public static String pattern(int numofpatterns)
    {      String result="";
    if(numofpatterns<0)
        result=result+"invalid input";

        for(int outer=1;outer<=numofpatterns;outer++) // two for loops are used to print the required pattern
        {
            for(int inner=1;inner<=outer;inner++)
            {
                result=result+outer; //required outputs are printed

            }


        }
        return result;

    }
}
