package Java.Java.J2_Conditionals_and_Loops;

public class Conditional_Statements {
    public static void main(String[] args) {

        char att = 'P';
        int total = 90;

        if (att == 'P')
        {
            System.out.println("Present");
            if (total >= 50)
            {
                System.out.println("School Will work. Because Total students greater than 50%");
            }
            else
            {
                System.out.println("School Will Not Work. Because Total students lesser than 50%");
            }
        }

        else if (att == 'O')
        {
            System.out.println("On duty");
        }

        else
        {
            System.out.println("Absent");
        }
        System.out.println("Program Ends...");
    }
}
