import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i = 0; i <= num/2; i++) {
            if(num==Math.pow(2,i)){
                System.out.println("Number is in power of 2");
            }
        }
    }
}
