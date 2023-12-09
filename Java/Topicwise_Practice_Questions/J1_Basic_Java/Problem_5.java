/*
 Problem_5 :-
 Input currency in rupees and output in USD.
*/


package Java.Topicwise_Practice_Questions.J1_Basic_Java;

import java.util.Scanner;

public class Problem_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Currencies is Rupees: ");
        float inr = input.nextFloat();
        System.out.println("USD = " + (inr * 0.012));
    }
}