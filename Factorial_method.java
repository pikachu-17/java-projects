import java.util.Scanner;

public class Factorial_method {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int a= scan.nextInt();
        System.out.println("Factorial of Given Input is : "+factorial(a));
    }
    static int factorial(int a){
        int fact=1;
        for(int i =1;i<=a;i++){
            fact*=i;
        }
        return fact;
    }
}
