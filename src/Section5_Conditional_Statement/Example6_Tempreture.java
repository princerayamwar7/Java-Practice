package Section5_Conditional_Statement;

public class Example6_Tempreture {
    static void main(String[] args)
    {
        int temp = 35;

        if (temp >=40)
        {
            System.out.println("Turn on AC");

        }

        else if (temp >=30)
        {
            System.out.println("Turn on Cooler");

        }

        else if (temp >=20)
        {
            System.out.println("Turn on Fan");

        }

        else if (temp >= 10)
        {
            System.out.println("Turn on Heater");

        }

        else
        {
            System.out.println("Tempreture is very  low");

        }

    }
}
