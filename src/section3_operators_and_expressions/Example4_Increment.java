package section3_operators_and_expressions;

public class Example4_Increment {
    static void main(String[] args) {

        // Post increment
        int a = 11;
        int b = 20;
        int c = 19;

        System.out.println(a++ + a+b + c++ + b);

        // new variable increment

        int A = 3;
        int B = 7;
        int C = 5;
        int D = 9;

        int E = A++ + B++ + A+B + C++ + D + D++ + D;

        System.out.println(E);

        // Pre increment
        int Num1 = 7;
        int Num2 = 9;
        int Num3 = 12;
        int Num4 = 10;
        int Num5 = ++Num1 + ++Num2 + Num1+Num2+ ++Num3 + ++Num4+Num4 ;

        System.out.println(Num5);

        // Both together Pre + Post
        int p = 10;
        int q = 13;
        int r = 7;

        int s = p++ * ++q + ++p + r++ + ++q * ++r;

        System.out.println(s);

        // pre decrement
        int x = 10;
        int y = 11;

        int z= --x + --y+x;

        System.out.println(z);

        // pre decrement
        int L = 10;
        int M = 11;

        int N= L-- + M-- + L;

        System.out.println(N);


    }
}
