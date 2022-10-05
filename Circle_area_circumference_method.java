import java.util.Scanner;

public class Circle_area_circumference_method {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Radius:");
        float rad = scan.nextFloat();
        circumference(rad);
        area(rad);

    }

    static void area(float rad) {
        float ar = (float) (3.14*rad*rad);
        System.out.println("Area of given circle is: "+ar);
    }

    static void circumference(float r){
        float circ = (float) (2*3.14*r);
        System.out.println("Circumference of given circle is: "+circ);
    }
}
