import java.util.Scanner;

public class PerimeterofSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Side of Square: ");
        float side = scan.nextFloat();

        float perimeter = (float) (4 * side);
        System.out.println("Perimeter of Square is : " + perimeter);
    }
    }
