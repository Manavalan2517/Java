
// Problem_1 :-
// Sum of Two numbers


package Java.Topicwise_Practice_Questions.J1_Basic_Java;

import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num_1 = input.nextInt();

        System.out.print("Enter number 2: ");
        int num_2 = input.nextInt();

        int sum = num_1 + num_2;

        System.out.println("Sum of two numbers is: "+sum);
    }
}
