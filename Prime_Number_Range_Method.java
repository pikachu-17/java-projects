import java.util.Scanner;

public class Prime_Number_Range_Method {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter upper bound: ");
        int u = scan.nextInt();
        System.out.println("enter lower bound: ");
        int l = scan.nextInt();
        prime(u,l);
    }

    static void prime(int u, int l) {
        for (int i = l; i <=u ; i++) {
            for (int j = 2; j < i ; j++) {
                if( i % j ==0) {
                    break;
                }
                else {
                    System.out.print(i +" ");
                }
            }
        }
    }
}
