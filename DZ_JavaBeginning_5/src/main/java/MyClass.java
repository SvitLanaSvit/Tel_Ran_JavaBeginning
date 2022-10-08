import java.util.Scanner;

public class MyClass {
    public static void main(String[] args)
    {
        //Task 1
        GetWord(GetNumOfEvenWord());
        System.out.println();

        //Task 2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value first: ");
        float a = scanner.nextFloat();
        System.out.println("Enter value second: ");
        float b = scanner.nextFloat();
        MathOperations mathOperations = new MathOperations();
        mathOperations.MultiplicationFunc(a,b);
        mathOperations.MinusFunc(a,b);
        mathOperations.PlusFunc(a,b);
        mathOperations.DivisionFunc(a,b);
        System.out.println();

        //Task 3
        System.out.println("Enter value of euro to convert to dollar: ");
        double val = scanner.nextDouble();
        System.out.println(String.format("%.2f", val) + " Euro = " +
                String.format("%.2f", CurrencyConverterEuroToDollar(val))+ " $");
        System.out.println();

        //Task 4 (Level 2)
        System.out.println("Enter first diameter of pizza: ");
        int d1 = scanner.nextInt();
        System.out.println("Enter second diameter of pizza: ");
        int d2 = scanner.nextInt();
        System.out.println("Difference calories of pizzas: " + String.format("%.2f",GetCalorieDifference(d1,d2)));
    }

    static String GetNumOfEvenWord() {
        System.out.println("Enter one even word: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        if (word.length() % 2 != 0)
            System.out.println("The number of letters in the word is not even");
        else
            System.out.println("The number of letters in the word is " + word.length());
        return word;
    }
    static void GetWord(String word) {
        if (word.length() % 2 == 0) {
            String wordFistPart = word.substring(0, (word.length() / 2));
            String wordSecondPart = word.substring(word.length() / 2, word.length());
            System.out.println("We concat " + wordFistPart.toUpperCase() + " with " + wordSecondPart.toUpperCase() +
                    " and have " + wordFistPart.toUpperCase() + wordSecondPart.toUpperCase());
        }
    }
    static double CurrencyConverterEuroToDollar(double val) {
        return val * 0.97;
    }
    static double GetCalorieDifference(int d1, int d2){
        double res = 0.0;
        double Area1 = Math.PI * Math.pow(d1/2, 2);
        double Area2 = Math.PI * Math.pow(d2/2, 2);
        res = (Area1 - Area2) * 40;
        if (res < 0)
            res = -res;
        return res;
    }
}

