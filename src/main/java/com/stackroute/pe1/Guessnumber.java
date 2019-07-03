package com.stackroute.pe1;


/*8. Write a program which accepts a number from user as input (set the limit say 1 - 50 or 1 - 100)
User should guess until the the target number is guessed correctly. Print separate messages for the following:
a. Number guessed is more than original number b. Number guessed is less than original number c.
 Number guessed matches the original number
*/
import java.util.*;

public class Guessnumber
{

    public static void main(String args[])
    {
        numberguess();//user defined method called
    }
    static  void numberguess()

    {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int from = 1;
        int to = 100;
        int randomNumber = random.nextInt(to - from ) ;//random number is formed
        int guessedNumber = 0;

        System.out.printf("The number is between %d and %d.\n", from, to);

        do     //loop is checked till the guessed no is same as random number
        {
            System.out.print("Guess what the number is: ");
            guessedNumber = scan.nextInt();
            if (guessedNumber > randomNumber)
                System.out.println("Your guess is too high!");
            else if (guessedNumber < randomNumber)
                System.out.println("Your guess is too low!");
            else
                System.out.println("You got it!");
        } while (guessedNumber != randomNumber);
    }
}
