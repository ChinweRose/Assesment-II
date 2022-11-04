import java.util. Scanner;
public class Task4 {
    public static void main(String[] args) {
        double pi = 3.142;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter radius: ");
        int a= input.nextInt();

        System.out.println("Perimeter is: " + pi * a * 2 );

        System.out.println("Area is: " + Math.pow(a , 2) * (pi));
        
    }
}
