
/*
Problem_11 :-
Input a number and print all the factors of that number (use loops).
 */



package Java.Topicwise_Practice_Questions.J2_Conditionals_and_Loops;

import java.util.Scanner;

public class Problem_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.println("Factors of " + num + ":");
        for (int i = 1; i <= num; i++)
        {
            if (num % i == 0)
            {
                System.out.println(i);
            }
        }
    }
}