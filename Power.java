import java.util.Scanner;
import java.lang.Math;

public class Power {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter exponent: ");
        int a = scan.nextInt();
        System.out.print("Enter Power: ");
        int b = scan.nextInt();
        double result = Math.pow(a,b);
        System.out.println("Result: "+result);
    }
}
