import java.util.Scanner;

public class PerimeterofCircle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter radius: ");
        float rad = scan.nextFloat();
        float perimeter = (float)(rad*2*3.14);
        System.out.println("Circumference of circle is : "+perimeter);

    }
}
