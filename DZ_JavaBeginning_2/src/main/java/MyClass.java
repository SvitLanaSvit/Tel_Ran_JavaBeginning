public class MyClass {
    public static void main(String[] args) {
        //1
        System.out.println("Перевести число 478 из шестнадцатеричной в десятичную");
        int val_1 = 478;
        String val16_10 = Integer.toString(val_1);
        HexToDecimal(val16_10);
        System.out.println();
        //2
        System.out.println("Разложить число 200345 на разряды в десятичной системе");
        int val_2 = 200345;
        DigitsFromVal(val_2);
        DigitsFromValWhile(val_2);
        System.out.println();
        //3
        System.out.println("Перевести 637 из десятичной в шестнадцатеричную и обратно (10->16 и 16->10)");
        int val_3 = 637;
        String hex = DecimalToHex(val_3);
        System.out.println("Val 10->16: " + hex);
        HexToDecimal(hex);
        System.out.println();
        //4
        System.out.println("Перевести 637 из десятичной в двоичную");
        DecimalToBinary(val_3);
        System.out.println();
        //5
        System.out.println("11100111 перевести в десятичную");
        int val_5 = 11100111;
        BinaryToDecimal(val_5);
        System.out.println();
        //6
        System.out.println("Перевести 637 из десятичной в троичную");
        TripleToDecimal(val_3);
        System.out.println();
    }

    static void HexToDecimal(String val)
    {
        char[] hexChars = new char[]{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 ,16};
        char[] arr = new char[val.length()];
        for (int i = 0; i < val.length(); i++)
        {
            arr[i] = val.charAt(i);
        }

        int[] arrInt = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < hexChars.length; j++){
                if (arr[i] == hexChars[j])
                {
                    arrInt[i] = j;
                }
            }
        }

        int res = 0;
        int pow = arrInt.length - 1;
        for (int i = 0; i < arrInt.length; i++)
        {
            res += (int)(arrInt[i] * Math.pow(16, pow));
            pow--;
        }

        System.out.println("Val 16->10: " + res);
    }
    static void DigitsFromVal(int val)
    {
        //Разложить число 200345 на разряды в десятичной системе
        int hThousand = (val/100000) % 10;
        int tenThousand = (val/10000) % 10;
        int thousand = (val/1000) % 10;
        int hundreds = (val / 100) % 10;
        int dozens = (val / 10) % 10;
        int units = val % 10;

        System.out.println("hundred thousands in value:\t" + hThousand +
                "\nten thousands in the value:\t" + tenThousand +
                "\nthousands in the value:\t\t" + thousand +
                "\nhundreds in the value:\t\t" + hundreds +
                "\ndozens in the value:\t\t" + dozens +
                "\nunits in the value:\t\t\t" + units);
    }
    static void DigitsFromValWhile(int val)
    {
        StringBuilder sb = new StringBuilder();
        int revers;
        while(val > 0)
        {
            revers = val % 10;
            val /= 10;
            sb.append(revers + "\n");
        }
        sb.reverse();
        System.out.println();
    }
    static String DecimalToHex(int val)
    {
        int remainder;
        String hex = "";
        char[] hexChars = new char[]{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(val > 0)
        {
            remainder = val % 16;
            hex = hexChars[remainder] + hex;
            val = val/16;
        }
        return hex;
    }
    static  void DecimalToBinary(int val)
    {
        StringBuilder sb = new StringBuilder();
        int remainder;
        while(val > 0)
        {
            remainder = val % 2;
            val = val / 2;
            sb.append(remainder);
        }

        System.out.println(sb.reverse());
    }
    static void BinaryToDecimal(int val)
    {
        String valS = Integer.toString(val);
        String[] valArrS = valS.split("");
        int[] arr = new int[valArrS.length];
        int res = 0;
        int pow = arr.length - 1;
        for (int i = 0; i < valArrS.length; i++)
        {
            arr[i] = Integer.parseInt(valArrS[i]);
            res += (int)(arr[i] * Math.pow(2, pow));
            pow--;
        }

        System.out.println("Val 2->10: " + res);
    }
    static void TripleToDecimal(int val)
    {
        StringBuilder sb = new StringBuilder();
        int remainder;
        while(val > 0)
        {
            remainder = val % 3;
            val = val / 3;
            sb.append(remainder);
        }

        System.out.println(sb.reverse());
    }
}