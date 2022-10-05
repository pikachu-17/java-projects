import java.util.Scanner;

public class CSAofCylinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter radius and height of Cylinder: ");
        float rad = scan.nextFloat();
        float ht = scan.nextFloat();
        float csa = (float)(2*3.14*rad*ht);
        System.out.println("the Curved Surface area of entered cylincder is : "+ csa);
    }
}
