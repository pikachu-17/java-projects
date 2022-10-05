import java.util.Scanner;

public class Sum_method {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        add(a,b);
        product(a,b);
    }

    static void product(int a, int b) {
    int product = a*b;
        System.out.println("product of given numbers is: "+product);

    }

    static void add(int a, int b) {
        int sum = a+b;
        System.out.println("sum of given numbers is: "+sum);
    }
}
