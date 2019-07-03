package com.stackroute.pe1;

/*3. Create a program that accepts a word as input and checks for each single character letter in the word
whether it is a consonant or vowel. Condition:
a. Print an error message if the input is not a letter b. If the input having more than one letter, print the required output
(Vowel or Consonant) for each letter
Input : p Output : Consonant
Input : ap Output : Vowel Consonant (should it be a - vowel, p - consonant)
*/

public class Checkinput
{


  public static String inputcheck(String stringinputted)

    {

        int size=stringinputted.length();
        int i=0;
        String output="";
        while(i<size)
        {
            if(Character.isLetter(stringinputted.charAt(i)))//the input is checked if it is a vowel or a consonant
            {
                if(stringinputted.charAt(i)=='a'||stringinputted.charAt(i)=='e'||stringinputted.charAt(i)=='i'||stringinputted.charAt(i)=='o'||stringinputted.charAt(i)=='u'||stringinputted.charAt(i)=='A'||stringinputted.charAt(i)=='E'||stringinputted.charAt(i)=='I'||stringinputted.charAt(i)=='O'||stringinputted.charAt(i)=='U')
                {
                    output=output+((stringinputted.charAt(i)+"Vowel\n"));
                }
                else
                {
                    output=output+((stringinputted.charAt(i)+"Consonant\n"));

                }

            }
            else
            {
                break;

            }
            i++;

        }
        if(i==size)
            return output;
        else
            return "Other output";

    }




}
