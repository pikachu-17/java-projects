import java.util.Scanner;

public class Sum_of_First_n_natural_numbers_method {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int n = 1;
        int sum1 = 0;
        while (n != 0) {
            n = scan.nextInt();
            sum1 += sum(n);
        }
        System.out.println("Sum to the numbers are: " + sum1);
    }
    static int sum( int n ){
        int add = 0;
        add+= n;
        return add;
    }
}