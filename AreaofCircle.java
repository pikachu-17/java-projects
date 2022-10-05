import java.util.Scanner;
public class AreaofCircle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Radius of circle: ");
        float r= s.nextFloat();
        float area = (float) (3.14*r*r);
        System.out.println("Area of Circle is: "+ area);
    }
}
