
/*
Problem_13 :-
Take integer inputs till the user enters 0 and print the largest number from all.
 */



package Java.Topicwise_Practice_Questions.J2_Conditionals_and_Loops;

import java.util.Scanner;

public class Problem_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 0 to stop the loop");
        int max = 0;
        while (true)
        {
            System.out.print("Enter any number: ");
            int num = input.nextInt();
            if (max < num)
            {
                max = num;
            }
            if (num == 0)
            {
                break;
            }
        }
        System.out.println("Max number = " + max);
    }
}
