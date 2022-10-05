import java.util.Scanner;

public class PerimeterofRhombus {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the side of Rhombus: ");
        float side = scan.nextFloat();
        float perimeter = (float) (4* side);
        System.out.println("Perimeter of Rhombus is : " + perimeter);

    }
}