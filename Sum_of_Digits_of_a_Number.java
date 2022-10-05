import java.util.Scanner;

public class Sum_of_Digits_of_a_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number: ");
        int a = scan.nextInt();
        int temp = a;
        int sum =0;
        while(temp>0){
            int b =temp%10;
            sum+=b;
            temp/=10;
        }
        System.out.println("Sum of digits of a number is : "+sum);
    }
}
