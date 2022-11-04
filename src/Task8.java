import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length value: ");
        int a = input.nextInt();

        System.out.println("Enter the breadth value: ");
        int b = input.nextInt();


        System.out.println("Perimeter is: " + 2 * (a + b));
        System.out.println("Area is: " +  a * b );

    }
}
