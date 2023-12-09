
/*
Problem_17 :-
Perimeter Of Square
 */



package Java.Topicwise_Practice_Questions.J1_Basic_Java;

import java.util.Scanner;

public class Problem_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side of the square: ");
        float side = input.nextFloat();
        double perimeter = 4 * side;
        System.out.println("Perimeter Of square is = " + perimeter);
    }
}
