import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number for which you want factorial: ");
        int a = scan.nextInt();
        int fact =1;
        for (int i =1;i<=a;i++){
            fact *=i;
        }
        System.out.println("Factorial of the number is: "+fact);
    }
}
