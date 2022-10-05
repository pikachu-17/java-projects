import java.util.Scanner;

public class DepreciationofValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the cost of asset: ");
        float coa = scan.nextFloat();
        System.out.print("enter the Salvage value: ");
        float sal_val= scan.nextFloat();
        System.out.print("enter the useful life of asset in years: ");
        float use_life = scan.nextFloat();
        float dv = (coa - sal_val)/use_life;
        System.out.println("Depreciation Value of product per year is: "+dv);
    }
}
