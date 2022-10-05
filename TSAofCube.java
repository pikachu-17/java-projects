import java.util.Scanner;

public class TSAofCube {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the side of the cube: ");
        float side = scan.nextFloat();

        float tsa = (float)(6*side*side);
        System.out.println("Total Surface Area of given cube is: "+ tsa);

    }

}
