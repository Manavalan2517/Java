
/*
Problem_10 :-
Area Of Circle Java Program
 */



package Java.Topicwise_Practice_Questions.J1_Basic_Java;

import java.util.Scanner;

public class Problem_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double area;
        float radius;
        System.out.print("Enter the radius of the circle: ");
        radius = input.nextFloat();
        area = 3.14 * radius * radius;
        System.out.println("Area of the circle is = " + area);
    }
}
