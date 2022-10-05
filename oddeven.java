import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = input.nextInt();
        if(num%2==0)
        {
            System.out.println("the Number is even");
        }
        else
        {
            System.out.println("the Number is odd");
        }
    }
}
