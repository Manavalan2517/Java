/*
 Problem_4 :-
 Counting occurrences
*/

package Java.Topicwise_Practice_Questions.J2_Conditionals_and_Loops;

import java.util.Scanner;

public class Problem_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int num = input.nextInt();

        System.out.print("Which number do you want to count: ");
        int cnum = input.nextInt();


        int count = 0;
        while (num > 0)
        {
            int rem = num % 10;
            if (rem == cnum)
            {
                count++;
            }
            num = num / 10;
        }
        System.out.println(count);
    }
}