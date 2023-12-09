
// Problem_9 :-
// To find Armstrong Number between two given number.



package Java.Topicwise_Practice_Questions.J2_Conditionals_and_Loops;

import java.util.Scanner;

public class Problem_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the lower range value: ");
        int lowerrange = input.nextInt();
        System.out.print("Enter the upper range value: ");
        int higherrange = input.nextInt();

        for (int i = lowerrange; i <= higherrange; i++)
        {
            int num = i;
            int sum = 0;

            while (num > 0)
            {
                int rem = num % 10;
                sum = sum + (rem * rem * rem);
                num = num / 10;
            }
            if (sum == i)
            {
                System.out.println(sum);
            }
        }

    }
}
