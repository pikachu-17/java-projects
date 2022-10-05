import java.util.Scanner;

public class VolumeofPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the base length, base width and height of pyramid: ");
        float bl = scan.nextFloat();
        float bw = scan.nextFloat();
        float height = scan.nextFloat();
        float vol = (float)(bl*bw*height/3);
        System.out.println("Volume of given pyramid is: "+vol);
    }
}
