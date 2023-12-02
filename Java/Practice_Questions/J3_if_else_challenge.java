package Practice_Questions;


import java.util.Scanner;

public class J3_if_else_challenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("If Entered number is odd, print Weird");
        System.out.println("If Entered number n is even and in the inclusive range of  to , print Not Weird");
        System.out.println("If Entered number is even and in the inclusive range of  to , print Weird");
        System.out.println("If Entered number is even and greater than , print Not Weird");
        System.out.println("Enter any number");
        int N = scanner.nextInt();
        scanner.close();

        if (N % 2 == 0) {
            if (N >= 2 && N <= 5) {
                System.out.println("Not Weird");
            } else if (N >= 6 && N <= 20) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }

        } else {
            System.out.println("Weird");
        }
    }
}
