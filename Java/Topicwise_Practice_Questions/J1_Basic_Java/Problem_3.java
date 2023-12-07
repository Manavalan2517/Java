package Java.Topicwise_Practice_Questions.J1_Basic_Java;

import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Temperature in Celsius: ");
        float celsius = input.nextFloat();
        float fahrenheit = (celsius * 9/5) + 32;
        System.out.println(fahrenheit);
    }
}
