import java.util.Scanner;
public class AreaofTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base of the triangle: ");
        float base = in.nextFloat();
        System.out.println("Enter the Height of Triangle: ");
        float height = in.nextFloat();
        float area = (float) (base*height*0.5);
        System.out.println("Area of Triangle is: "+ area);

    }
}
