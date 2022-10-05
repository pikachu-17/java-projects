import java.util.Scanner;

public class CommisionPercentage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter amount: ");
        float amt = scan.nextFloat();
        System.out.println("enter commission: ");
        float com = scan.nextFloat();
        float percentage = (com/amt)*100;
        System.out.println("Percentage of commission is : "+percentage+"%");

    }
}
