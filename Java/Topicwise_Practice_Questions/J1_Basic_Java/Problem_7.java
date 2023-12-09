
/*
Problem_7 :-
Area Of a Rectangle Program
 */



package Java.Topicwise_Practice_Questions.J1_Basic_Java;

import java.util.Scanner;

public class Problem_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Length of a rectangle: ");
        float length = input.nextFloat();
        System.out.print("Enter the breadth of a rectangle: ");
        float breadth = input.nextFloat();

        double area = length * breadth;
        System.out.println("Area of the rectangle is = " + area);
    }
}