import java.util.Scanner;

public class Number_Palindrome {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        palindrome(num);
    }

    static void palindrome(int num) {

         int temp = num;
         int rev =0;
         int a;
        while(temp > 0){
             a = temp % 10;
            rev = (int) ((rev *10) +a);
             temp=temp/10;
        }
        if(rev == num){
            System.out.println("Number is Palindrome.");
        }
        else {
            System.out.println("Number is not a Palindrome.");
        }
    }
}