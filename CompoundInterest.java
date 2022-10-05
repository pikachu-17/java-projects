import java.util.Scanner;
import java.lang.Math;
public class CompoundInterest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter initial principal balance: ");
        float pb = scan.nextFloat();
        System.out.print("enter interest rate: ");
        float inr=scan.nextFloat();
        System.out.print("enter number of times interest applied per time period: ");
        float nu=scan.nextFloat();
        System.out.print("enter number of time periods elapsed: ");
        float t = scan.nextFloat();
        float amount = (float) (pb*Math.pow((1+inr/nu),nu*t));
        System.out.println("compound interest can be calculated as: "+amount);

    }
}
