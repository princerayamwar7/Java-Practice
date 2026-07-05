import java.util.Scanner;

public class Example5 {
    static void main(String[] args)
    {

        // Write a Java program which asks the user to enter his/her name and greets them with:
        // Hello <name>, have a good day.

        System.out.print("Hello, What is Your Name: ");
        Scanner name = new Scanner(System.in);
        String Name = name.next();
        System.out.println("Hello " + Name + " ,Have a Good Day!");

    }
}
