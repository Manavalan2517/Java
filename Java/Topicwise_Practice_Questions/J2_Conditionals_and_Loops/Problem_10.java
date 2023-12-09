
/*
Problem_10 :-
Subtract the Product and Sum of Digits of an Integer
 */

package Java.Topicwise_Practice_Questions.J2_Conditionals_and_Loops;

import java.util.Scanner;

public class Problem_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();


        int n = num;
        int product = 1;
        int sum = 0;
        while (n > 0)
        {
            int rem = n % 10;
            product = rem * product;
            sum = sum + rem;
            n = n / 10;
        }
        System.out.println("Product of digits = " + product);
        System.out.println("Sum of digits = " + sum);
        System.out.println("Result = " + (product - sum));
    }
}
