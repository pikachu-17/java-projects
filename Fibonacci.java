import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of terms upto which you wish to print Fibonacci Series: ");
        int n = input.nextInt();
        long a =1;
        long b =1;
        System.out.print(a);
        System.out.print(",");
        System.out.print(b+ ",");
        int count =1;
        while ( count < n){
        long c = a+b;
        a=b;
        b=c;
            System.out.print(c + ",");
        count++;}

    }
}
