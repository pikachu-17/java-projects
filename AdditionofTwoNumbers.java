import java.util.Scanner;

public class AdditionofTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int sum = a + b;
        System.out.println("Sum of entered numbers are: "+ sum);
    }
}
