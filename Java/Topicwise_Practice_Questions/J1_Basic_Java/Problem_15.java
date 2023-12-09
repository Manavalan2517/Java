
/*
Problem_15 :-
Perimeter Of Equilateral Triangle
 */



package Java.Topicwise_Practice_Questions.J1_Basic_Java;

import java.util.Scanner;

public class Problem_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Base length of a parallelogram: ");
        float base = input.nextFloat();
        System.out.print("Enter the Side length of a parallelogram: ");
        float side = input.nextFloat();
        double perimeter =  2 * (base + side);
        System.out.println("Perimeter Of Equilateral Triangle is = " + perimeter);
    }
}
