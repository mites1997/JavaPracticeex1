package com.stackroute.pe1;
/*7. Write a program which accepts a number as input from user and perform the following: a.
sort the number in non-increasing order b. after sorting sum all the even numbers, the sum should be greater than 15 .
c. if sum is more than 15,then print output as true or false.
Input : 234534 Output : Sorted number in non-increasing order : 544332
Sum of even numbers : 10 False
*/


public class Sortnumber
{

   public static String numberSort(int numtobesorted)
    {
        String output="";

        String s1 = Integer.toString(numtobesorted); //converted to string
        char[] s2 = s1.toCharArray();//converted to char array
        int n = s2.length;
        int i = 0;
        int sum=0;
        //selection sort algorithm applied

        // One by one move boundary of unsorted subarray
        for (i = 0; i < (n - 1); i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (s2[j] > s2[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            char temp = s2[min_idx];
            s2[min_idx] = s2[i];
            s2[i] = temp;
        }
        for(int j=0;j<n;j++)
        {
            System.out.print(s2[j]);
            char k=s2[j];

            if(k%2==0)
            {
                sum=sum+(k-48);

            }
        }
        System.out.println();

        if(sum>15)//conditions checked
        {

            output=output+"true";
        }
        else
        {
            output=output+"false";
        }
        return output;
    }

}
