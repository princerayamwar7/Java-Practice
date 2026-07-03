import java.util.Scanner;

public class Example2 {
    static void main(String[] args)
    // Write a program to sum three numbers in Java.
    {
        System.out.println("Please Enter Your Number");
        Scanner adding = new Scanner(System.in);

        System.out.println("Enter  Num1");
        int Num1 = adding.nextInt();

        System.out.println("Enter  Num2");
        int Num2 = adding.nextInt();

        System.out.println("Enter  Num3");
        int Num3 = adding.nextInt();

        int sum = Num1 + Num2 + Num3;
        System.out.print("The Sum of the Three Number is: ");
        System.out.println(sum);

    }
}
