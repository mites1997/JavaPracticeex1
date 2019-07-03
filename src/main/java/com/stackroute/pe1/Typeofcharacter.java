package com.stackroute.pe1;

/* Write a program that takes a character from the user as input and determines whether the character entered is a
capital letter, a small case letter, a digit or a special symbol and display appropriately. Input: A Output: Capital letter*/
import java.util.Scanner;

public class Typeofcharacter
{


   public static  String characterCheck(char inputtedchar)
    {


        String output="";
        if((inputtedchar>='a'&&inputtedchar<='z')) //condition for small letter
        {

            output=output+"small letter";
        }
        else if(inputtedchar>='A'&&inputtedchar<='Z') //condition for capital letter
        {

            output=output+"Capital";
        }
        else if(inputtedchar>='0'&&inputtedchar<='9') //condition for number
        {
            output=output+"number";
        }
        else //condition for special character
        {

            output=output+"special char";
        }
        return output;

    }
}
