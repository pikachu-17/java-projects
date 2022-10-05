import java.util.Scanner;
import java.math.*;
public class AreaofEquilateralTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter side of Triangle: ");
        float s = scan.nextFloat();
        float area = (float) (s*s*(1.732/4));
        System.out.println("Area of Equilateral Triangle given is: "+area);
    }
}
