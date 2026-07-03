package section3_operators_and_expressions;

public class Example3_Logical_Operators {
    static void main(String[] args)
    {
        int a = 10;
        int b = 7;
        int c = 19;
        // Logical AND && Operator
        System.out.println(a>b && c<b);
        System.out.println(a>b && c!=b);

        // Logical OR || Operator
        System.out.println(a>b || c<10);
        System.out.println(a>b || a!=b);
        System.out.println(a<b || c<10);

        // Logical NOT ! Operator
        System.out.println(!(a>b && c<b));
        System.out.println(!(a>b && c!=b));
        System.out.println((!(a>b)) || c<10);
        System.out.println(!(a<b || c<10));




    }
}
