package section2_introduction_to_variable_datatype;

public class example1_Variable {
    static void main(String[] args)
    {
        // -128 t0 127
        byte lbNum1 = 120;
        System.out.println(lbNum1);

        // -32000 to 32000
        short lsNum1 = 20000;
        System.out.println(lsNum1);

        // -2B to +2B
        int liNum1 = 2000000000;
        System.out.println(liNum1);


        // Data is more than 2B
        long llnNum1 = 20000000000000L;
        System.out.print(llnNum1);

        // float 12.00000002662262
        float lfNum1 = 12.545611685121654f;
        System.out.println(lfNum1);

        // Double
        double ldNum1 = 12.54561168512165;
        System.out.println(ldNum1);

        //character
        char cData = 'A';
        System.out.println(cData);

       // example of 'ascii'
        char cdata1 = 67;
        System.out.println(cdata1);

        // now reverse
        int liNum2 = 'A';
        System.out.println(liNum2);

        //unicode
        char cData2 = '\u07A5';
        System.out.println(cData2);


        // boolean
        boolean isPrimeNumber = false;
        System.out.println(isPrimeNumber);

        boolean hasContains = true;
        System.out.println(hasContains);

        boolean flag = false;
        System.out.println(flag);


    }
}
