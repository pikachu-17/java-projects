import java.util.Scanner;
public class AreaofIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of base: ");
        float base= in.nextFloat();
        System.out.print("Enter the length of Altitude: ");
        float altitude = in.nextFloat();
        float area = (float) (0.5*base*altitude);
        System.out.println("Enter the Area of Isosceles Triangle: "+area);

    }
}
