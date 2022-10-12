import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter currently hours from 9 until 17: ");
        int hours = scanner.nextInt();
        System.out.println("Enter currently minutes: ");
        int minutes = scanner.nextInt();
        if (hours >= 9 && hours <=17 && minutes >=0 && minutes <=59)
            GetDifference(hours,minutes);
        else
            System.out.println("Enter right hours or minutes!!!");
    }

    static void GetDifference(int hours, int minutes){
        int difHours;
        if (minutes > 0){
            difHours = (16 - hours)*3600 + minutes*60; //sec
        }
        else
            difHours = (17 - hours)*3600 + minutes*60;

        double hoursD = (double)difHours/3600;
        double minutesD = (double)difHours/60;

        System.out.println("Until the end of the working day, seconds: " + difHours);
        System.out.println("Until the end of the working day, minutes: " + String.format("%,.2f", minutesD));
        System.out.println("Until the end of the working day, hours  : " + String.format("%,.2f", hoursD));
    }
}
