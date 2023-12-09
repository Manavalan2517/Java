
/*
Problem_26 :-
Addition Of Two Numbers
 */



package Java.Topicwise_Practice_Questions.J1_Basic_Java;

import java.util.Scanner;

public class Problem_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();
        System.out.println("Sum of two numbers = " + (num1 + num2));
    }
}