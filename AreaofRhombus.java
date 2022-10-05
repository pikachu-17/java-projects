import java.util.Scanner;

public class AreaofRhombus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Length of major and minor diagonal respectively: ");
        float diag1= scan.nextFloat();
        float diag2= scan.nextFloat();
        float area = diag1*diag2/2;
        System.out.println("Area of the Rhombus is: "+ area);
    }
}
