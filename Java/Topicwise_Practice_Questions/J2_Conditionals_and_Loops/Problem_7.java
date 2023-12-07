
// Problem_7 :-
// Check whether a number is even or odd


package Java.Topicwise_Practice_Questions.J2_Conditionals_and_Loops;

import java.util.Scanner;

public class Problem_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = input.nextInt();

        if (num % 2 == 0)
        {
            System.out.println("Entered number is an EVEN");
        }
        else
        {
            System.out.println("Entered number is ODD");
        }
    }
}
