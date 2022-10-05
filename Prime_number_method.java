import java.util.Scanner;

public class Prime_number_method {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number to find it is prime or not: ");
        int a = scan.nextInt();
       if(isprime(a)){
           System.out.println("Prime Number");
       }
       else
       {
           System.out.println("Not a Prime Number");
       }
    }

    static boolean isprime(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0)
                return false;
        }

        return true;

    }
}
