
/*
Problem_12 :-
Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
 */



package Java.Topicwise_Practice_Questions.J2_Conditionals_and_Loops;

import java.util.Scanner;

public class Problem_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 0 to stop the loop");
        int sum = 0;
        while (true)
        {
            System.out.print("Enter any number: ");
            int num = input.nextInt();
            sum += num;
            if (num == 0)
            {
                break;
            }
        }
        System.out.println("Sum of all the numbers = " + sum);
    }
}
