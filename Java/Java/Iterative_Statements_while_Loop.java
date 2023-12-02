package Java;

public class Iterative_Statements_while_Loop {
    public static void main(String[] args) {
        int num = 5;
        int i = 1;
        int sum = 0;

        //while_loop
        while (i<=num){
            sum += i;
            i++;
        }
        System.out.println(sum);

        // do while loop
        int j = 1;
        int add = 0;
        int number = 5;
        do{
            add += j;
            j++;
        }while (j<=number);
        System.out.println(add);
    }
}
