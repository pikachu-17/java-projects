import java.util.Scanner;
import java.lang.Math;
public class FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the present value of investment: ");
        float pv = scan.nextFloat();
        System.out.println("Enter the interest paid by investment: ");
        float i = scan.nextFloat();
        System.out.println("Enter the number of periods the investment will be held: ");
        float n = scan.nextFloat();

        float fv = (float) (pv*Math.pow(1+i,n));
        System.out.println("the future investment value will be: "+fv);

    }
}
