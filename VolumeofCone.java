import java.util.Scanner;

public class VolumeofCone {
    public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius and Actual height of Cone: ");
        float rad = scan.nextFloat();
        float ht= scan.nextFloat();
        float vol = (float) (3.14*rad*rad*ht/3);
        System.out.println("Volume of cone is: "+vol+" cubic units");
    }
}
