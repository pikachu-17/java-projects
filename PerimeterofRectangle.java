import java.util.Scanner;

public class PerimeterofRectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Length and Breadth respectively: ");
        float length = scan.nextFloat();
        float breadth = scan.nextFloat();
        float perimeter = (float)(2*(length+breadth));
        System.out.println("Perimeter of Equilateral Triangle is : "+perimeter);

    }
}
