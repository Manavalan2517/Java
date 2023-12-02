package Java;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter your name: ");
        String val = scanner.next();
        System.out.println("Enter your age: ");
        int a = scanner.nextInt();
        scanner.close();

        System.out.println("My name is " + val);
        System.out.println("My age is " + a);

    }
}
