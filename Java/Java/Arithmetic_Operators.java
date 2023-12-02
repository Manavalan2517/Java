package Java;

public class Arithmetic_Operators {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        int c = a+b;
        int d = a-b;
        int e = a*b;
        int f = a/b;
        int g = a%b;
        float h = (float)a/(float)b;

        System.out.println("Added = "+c);
        System.out.println("Subtracted = "+d);
        System.out.println("Multiplied = "+e);
        System.out.println("Divided = "+f);
        System.out.println("Modulus = "+g);
        System.out.println("Divided with float value = "+h);

        a++;
        System.out.println("Incremented 5 to "+a);
        b--;
        System.out.println("Decremented 10 to "+b);

        int i = 7;
        System.out.println("i value "+ i++);
        System.out.println("Incremented i value "+ i);
        System.out.println("i value"+ i--);
        System.out.println("Decremented i value "+ i);

        int j = 7;
        System.out.println("Incremented j value "+ ++j);
        System.out.println("j value "+ j);
        System.out.println("Decremented j value "+ --j);
        System.out.println("j value "+ j);
    }
}
