
/*
Problem_11 :-
Area Of Rhombus
 */



package Java.Topicwise_Practice_Questions.J1_Basic_Java;

import java.util.Scanner;

public class Problem_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the first diagonal: ");
        float diagonal1 = input.nextFloat();
        System.out.print("Enter the length of the second diagonal: ");
        float diagonal2 = input.nextFloat();
        double perimeter =  (diagonal1 * diagonal2) / 2;
        System.out.println("Area Of Rhombus is = " + perimeter);
    }
}
