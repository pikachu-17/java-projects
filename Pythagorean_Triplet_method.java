import java.util.Scanner;

public class Pythagorean_Triplet_method {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three sides: ");
        int a = scan.nextInt();
        int b= scan.nextInt();
        int c = scan.nextInt();
        pythagoreantriplet(a, b,c);
    }

    static void pythagoreantriplet(int a, int b, int c) {
    if((a*a+b*b==c*c) || (a*a + c*c == b*b) || (b*b+c*c==a*a) ){
        System.out.println("Pythagorean triplet");
    }
    else {
        System.out.println("not a Pythagorean triplet");
    }

    }
}
