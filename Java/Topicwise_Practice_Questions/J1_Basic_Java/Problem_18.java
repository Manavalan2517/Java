
/*
Problem_18 :-
Perimeter Of Rhombus
 */



package Java.Topicwise_Practice_Questions.J1_Basic_Java;

import java.util.Scanner;

public class Problem_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side of the Rhombus: ");
        float side = input.nextFloat();
        double perimeter = 4 * side;
        System.out.println("Perimeter Of Rhombus is = " + perimeter);
    }
}
