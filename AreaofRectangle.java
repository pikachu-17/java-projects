import java.util.Scanner;

public class AreaofRectangle {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        System.out.print("Enter Length of Rectangle: ");
        float length = in.nextFloat();
        System.out.print("Enter Breadth of Rectangle: ");
        float breadth = in.nextFloat();
        float area = length*breadth;
        System.out.println("Area of Rectangle is: "+ area);
    }
}
