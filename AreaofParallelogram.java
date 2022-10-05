import java.util.Scanner;
public class AreaofParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Base of Parallelogram: ");
        float base = in.nextFloat();
        System.out.println("Enter the Height of Parallelogram: ");
        float height = in.nextFloat();
        float area = base*height;
        System.out.println("The area of Parallelogram is: "+ area);
    }
}
