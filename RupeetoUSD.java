import java.util.Scanner;

public class RupeetoUSD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount in Rupee: ");
        int r = input.nextInt();
        int d = r/80;
        System.out.println("Amount in Dollars: $"+ d);
    }
}
