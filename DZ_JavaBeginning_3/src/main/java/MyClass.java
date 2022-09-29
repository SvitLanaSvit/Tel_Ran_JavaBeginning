import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        //1First level
        System.out.println("Напишите алгоритм, который получает радиус от пользователя через терминал\n");
        System.out.println("Enter the radius to calculate the area of the circle: ");
        Scanner scanner = new Scanner(System.in);
        float radius = scanner.nextFloat();
        GetArea(radius);
        System.out.println();

        //2
        System.out.println("Напишите алгоритм, который спрашивает пользователя как его зовут и выводит в консоль " +
                "“Hello …….. !”");
        GetName();
        System.out.println();

        //3Second level
        System.out.println("Создайте строку через new - I study Basic Java!");
        String str = new String("I study Basic Java!");
        System.out.println("Last symbol: " + str.charAt(str.length() - 1));
        String strReplace = str.replace('a', '*');
        System.out.println(strReplace);
        System.out.println(str);
    }

    static void GetArea(float radius)
    {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of a circle with radius: " + area);
    }

    static void GetName()
    {
        System.out.println("I am your personal bot. My name is Bot. What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");
    }
}