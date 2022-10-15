import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Task_1();
        Task_2();
    }

    public static void Task_1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Is it weekend?");
        Boolean isWeekend = scanner.nextBoolean();
        System.out.println("Is it rain?");
        Boolean isRain = scanner.nextBoolean();
        Boolean canWalk;

        if (isWeekend == true && isRain==false)
            canWalk = true;
        else
            canWalk = false;

        System.out.println("Can walk? " + canWalk);
        System.out.println();
    }

    public static void Task_2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter positive temperature: ");
        float temperaturePositive = scanner.nextFloat();
        System.out.println("Enter negative temperature: ");
        float temperatureNegative = scanner.nextFloat();

        if (temperaturePositive > 100 && temperatureNegative < 100)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
