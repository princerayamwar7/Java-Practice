import java.util.Scanner;

public class Example6 {
    static void main(String[] args)
    {
        // Write a Java program to convert Kilometers to Miles.

        System.out.print("Enter your Value in Kilometers");
        Scanner Length = new Scanner(System.in);
       double Km = Length.nextDouble();

        double sum = Km *  0.621371;
        System.out.println("Convertion from Kilometer to Miles is: " + sum);


    }
}
