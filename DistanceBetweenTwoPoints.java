import java.util.Scanner;
import java.lang.Math;
public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x and y coordinate of first point: ");
        float x1 = scan.nextFloat();
        float y1 = scan.nextFloat();
        System.out.println("Enter x and y coordinate of second point: ");
        float x2 = scan.nextFloat();
        float y2 = scan.nextFloat();
        float dis = (float) Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println("Distance between the points is: "+dis+" Units.");
}
}