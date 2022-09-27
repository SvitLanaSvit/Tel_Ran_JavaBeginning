import java.util.Scanner;

public class MyClass {
    public static void main(String[] args)
    {
        //Task1();
        Task2();
    }

    static void Task1(){
//        char: G
//        integer: 89
//        byte: 4
//        short: 56
//        float: 4.7333436
//        double: 4.355453532
//        long: 12121

        char valChar = 'G';
        Integer valInt = 89;
        byte valByte = 4;
        short valShort = 56;
        float valFloat = 4.7333436f;
        double valDouble = 4.355453532;
        long valLong = 12121;

        System.out.println("char: " + valChar +
                "\ninteger: " + valInt +
                "\nbyte: " + valByte +
                "\nshort: " + valShort +
                "\nfloat: " + valFloat +
                "\ndouble: " + valDouble +
                "\nlong: " + valLong);
    }
    static void Task2()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a three-digit value: ");
        int val = sc.nextInt();
        if (val > 999 || val < 100)
            System.out.println("The val is not written correctly.");
        else
        {
            //ValueBreakdown(val);
            System.out.println("With StringBuilder: ");
            ValueBreakdownThroughStringBuilder(val);
        }
    }

    static void ValueBreakdown(int val)
    {
        int hundreds = (val / 100) % 10;
        int dozens = (val - (val / 100) * 100) / 10 % 10;
        int units = (val - (val / 100) * 100) % 10;

        System.out.println("hundreds in the value: " + hundreds +
                "\ndozens in the value: " + dozens +
                "\nunits in the value: " + units);
    }

    static void ValueBreakdownThroughStringBuilder(int val)
    {
        StringBuilder sb = new StringBuilder();
        while(val > 0)
        {
            sb.insert(0, val % 10);
            val = val / 10;
        }
        System.out.println(sb);
    }
}
