package Java.Java.J2_Conditionals_and_Loops;

public class Iterative_Statements_for_loop {
    public static void main(String[] args)
    {
        int n = 5;
        int sum = 0;
        for (int i = 1; i<=n ; i++)
        {
            //System.out.println(i+1 +" Hello World");
            sum += i;
        }
        System.out.println("Sum of first 5 natural numbers: " + sum);
    }
}