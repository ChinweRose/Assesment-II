import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = input.nextInt();

        System.out.println("Enter second number: ");
        int b = input.nextInt();

        System.out.println("Enter third number: ");
        int c = input.nextInt();

        double total = (a + b + c);
        System.out.println("Total is: " + total);

        double average = total/3;
        System.out.println("Average is: " + average);

    }
}
