import java.util.Scanner;

public class Even_odd_method {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int a = scan.nextInt();
        evenodd(a);
    }

    static void evenodd(int a) {
        if(a%2==0){
            System.out.println("entered number is even.");
        }
        else {
            System.out.println("entered number is odd.");
        }
    }
}
