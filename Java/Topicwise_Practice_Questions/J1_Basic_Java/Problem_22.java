
/*
Problem_22
Volume Of Sphere
 */



package Java.Topicwise_Practice_Questions.J1_Basic_Java;

import java.util.Scanner;

public class Problem_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the Sphere: ");
        float radius = input.nextFloat();
        double volume = 1.34 * 3.14 * radius * radius * radius;
        System.out.println("Volume Of Sphere is = " + volume);
    }
}