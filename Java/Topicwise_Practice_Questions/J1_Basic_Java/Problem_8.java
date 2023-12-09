
/*
Problem_8 :-
Area Of an Isosceles Triangle
 */



package Java.Topicwise_Practice_Questions.J1_Basic_Java;

import java.util.Scanner;

public class Problem_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base of the Isosceles triangle: ");
        float base = input.nextFloat();
        System.out.print("Enter the height of the Isosceles triangle: ");
        float height = input.nextFloat();

        double area = 0.5 * base * height;
        System.out.println("Area Of an Isosceles Triangle is = " + area);
    }
}
