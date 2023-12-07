package Java.Java.J1_Input_Output_Debugging_and_Datatypes;

public class J8_Logical_and_Relational_Operators_Operator_Precedence {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println(b>a);
        System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a==b);
        System.out.println(a!=b);

        boolean c = true;
        boolean d = false;
        boolean e = false;
        boolean f = true;

        System.out.println("Not operator: "+ !c);
        System.out.println("Not operator: "+ !d);

        System.out.println("Or Operator: "+ (c || d));
        System.out.println("Or Operator: "+ (e || d));

        System.out.println("And Operator: "+ (c && d));
        System.out.println("And Operator: "+ (c && f));


    }
}
