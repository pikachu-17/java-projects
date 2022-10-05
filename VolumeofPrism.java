import java.util.Scanner;

public class VolumeofPrism {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Base Area and Height of Prism: ");
        float base_area = scan.nextFloat();
        float height = scan.nextFloat();
        float vol = base_area*height;
        System.out.println("Volume of given Prism is: "+ vol);

    }
}
