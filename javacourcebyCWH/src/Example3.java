import java.util.Scanner;

public class Example3 {

    // Write a program to calculate percentage using marks of 5 subjects (out of 100).
    static void main(String[] args) {
        System.out.println("Percentage Calculator");
        Scanner Calculator = new Scanner(System.in);

        System.out.println("Enter Marks of 1st Subject");
        int sub1 = Calculator.nextInt();

        System.out.println("Enter Marks of 2nd Subject");
        int sub2 = Calculator.nextInt();

        System.out.println("Enter Marks of 3rd Subject");
        int sub3 = Calculator.nextInt();

        System.out.println("Enter Marks of 4th Subject");
        int sub4 = Calculator.nextInt();

        System.out.println("Enter Marks of 1st Subject");
        int sub5 = Calculator.nextInt();

        double total = sub1 + sub2 + sub3 + sub4 + sub5;
        double Result = ( total/500 ) * 100;
        System.out.println("Percentage of the Student:  ");
        System.out.print(Result + "%");

    }
}
