import java.util.Scanner;
//program to take an integer from the user and print the subtraction of sum and product of its digits.
public class SubtractionofProductandSumofdigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of digits in your number: ");
        int n=scan.nextInt();
        System.out.println("Enter Your Number: ");
        int num = scan.nextInt();
        int sum =0;
        int product = 1;
        for (int i =0; i<n; i++){
        int a =num %10;
        num=num/10;
        sum +=a;
        product*=a;}
        int subtraction = product-sum;
        System.out.println("the Final Answer is: "+subtraction);
    }

}
