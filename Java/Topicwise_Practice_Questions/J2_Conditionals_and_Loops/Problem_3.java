/*
 Problem_3 :-
 Fibonacci Series
*/


package Java.Topicwise_Practice_Questions.J2_Conditionals_and_Loops;

import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = input.nextInt();

        long prevnum = 0l;
        long currnum = 1l;
        long count = 2l;
        long res = 0l;
        while (count <= num)
        {
            res = prevnum + currnum;
            prevnum = currnum;
            currnum = res;
            count++;
//            System.out.println(res);
        }
        System.out.println(res);
    }
}