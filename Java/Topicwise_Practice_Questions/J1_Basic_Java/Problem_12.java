
/*
Problem_12 :-
Area Of Equilateral Triangle
 */



package Java.Topicwise_Practice_Questions.J1_Basic_Java;

import java.util.Scanner;

public class Problem_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side of the Equilateral Triangle: ");
        float side = input.nextFloat();
        double area =  1.73 * (side * side)/4;
        System.out.println("Area Of Equilateral Triangle is = " + area);
    }
}
