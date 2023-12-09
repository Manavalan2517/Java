
/*
Problem_23 :-
Volume Of Pyramid
 */



package Java.Topicwise_Practice_Questions.J1_Basic_Java;

import java.util.Scanner;

public class Problem_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Side length of the Pyramid: ");
        float side = input.nextFloat();
        System.out.print("Enter the height of the Pyramid: ");
        float height = input.nextFloat();
        double volume = 0.34 * side * side * height;
        System.out.println("Volume Of Pyramid is = " + volume);
    }
}
