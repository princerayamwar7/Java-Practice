import java.util.Scanner;

public class Example7 {
    static void main(String[] args)
    {

        // Write a Java program to detect whether a number entered by the user is an integer or not.

        System.out.print("Enter your Number: ");
        Scanner Num = new Scanner(System.in);
        System.out.println(Num.hasNextInt());
    }
}
