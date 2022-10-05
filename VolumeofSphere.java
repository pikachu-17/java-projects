import java.util.Scanner;

public class VolumeofSphere {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of sphere: ");
        float radius = scan.nextFloat();
        float vol = (float)(4*3.14*radius*radius*radius/3);
        System.out.println("Volume of given sphere is: "+ vol);

    }

}
