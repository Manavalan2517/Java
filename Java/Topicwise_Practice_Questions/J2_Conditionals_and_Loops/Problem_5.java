/*
 Problem_5 :-
 Reverse
*/


package Java.Topicwise_Practice_Questions.J2_Conditionals_and_Loops;

import java.util.Scanner;

public class Problem_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = input.nextInt();

        int ans = 0;
       while (num > 0)
        {
            int rem = num % 10;
            num = num/10;
            ans = ans * 10 + rem;
        }
        System.out.println(ans);
    }
}