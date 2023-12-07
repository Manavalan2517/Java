
// Problem_4 :-
// Program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.


package Java.Topicwise_Practice_Questions.J1_Basic_Java;

import java.util.Scanner;

public class Problem_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        int P = input.nextInt();
        System.out.print("Enter the interest rate (in percentage): ");
        double R = input.nextDouble();
        System.out.print("Enter the time duration (in years): ");
        int T = input.nextInt();

        double PRT = ((P*R*T)/100);
        System.out.println("Total Interest = " + PRT);
        System.out.println("End Balance = " + (PRT + P));
    }
}
