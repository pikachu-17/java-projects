import java.util.Scanner;

public class PerimeterofEquilateralTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter side: ");
        float side = scan.nextFloat();
        float perimeter = (float)(3*side);
        System.out.println("Perimeter of Equilateral Triangle is : "+perimeter);

    }
}
