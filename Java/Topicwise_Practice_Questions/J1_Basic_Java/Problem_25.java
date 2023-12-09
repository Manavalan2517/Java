
/*
Problem_25 :-
Total Surface Area Of Cube
 */



package Java.Topicwise_Practice_Questions.J1_Basic_Java;

import java.util.Scanner;

public class Problem_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side of the Cube: ");
        float side = input.nextFloat();
        double tsa = 6 * side * side;
        System.out.println("Total Surface Area Of Cube is = " + tsa);
    }
}