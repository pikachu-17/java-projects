import java.util.Scanner;

public class VolumeofCylinder {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the radius and height of cylinder : ");
    float radius = scan.nextFloat();
    float height = scan.nextFloat();
    float vol = (float)(3.14*radius*radius*height);
    System.out.println("Volume of given Cylinder is: "+ vol);

}
}
