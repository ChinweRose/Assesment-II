import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        
        System.out.println("Enter binary number: ");
        int num = input.nextInt();

        System.out.println("Enter binary number: ");
        int num1 = input.nextInt();


        double result = num + num1;
        System.out.println(result);
    }
}