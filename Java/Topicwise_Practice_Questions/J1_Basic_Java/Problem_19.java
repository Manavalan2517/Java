
/*
Problem_19 :-
Volume Of Cone
 */



package Java.Topicwise_Practice_Questions.J1_Basic_Java;

import java.util.Scanner;

public class Problem_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the cone: ");
        float radius = input.nextFloat();
        System.out.print("Enter the height of the cone: ");
        float height = input.nextFloat();
        double volume = 0.34 * 3.14 * radius * radius * height;
        System.out.println("Volume Of Cone is = " + volume);
    }
}
