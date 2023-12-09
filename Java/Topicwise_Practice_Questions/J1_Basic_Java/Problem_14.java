
/*
Problem_14 :-
Perimeter Of Equilateral Triangle
 */



package Java.Topicwise_Practice_Questions.J1_Basic_Java;

import java.util.Scanner;

public class Problem_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side of the Equilateral Triangle: ");
        float side = input.nextFloat();
        double perimeter = 3 * side;
        System.out.println("Perimeter Of Equilateral Triangle is = " + perimeter);
    }
}
