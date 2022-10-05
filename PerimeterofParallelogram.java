import java.util.Scanner;

public class PerimeterofParallelogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter sides: ");
        float a = scan.nextFloat();
        float b = scan.nextFloat();
        float perimeter = (float)(2*(a+b));
        System.out.println("Perimeter of Parallelogram is : "+perimeter);

    }
}
