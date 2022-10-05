import java.util.Scanner;

public class max_and_min_by_methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter three numbers: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        max(a,b,c);
        min(a,b,c);
    }

    static void min(int a, int b, int c) {
        if(a<b&&a<c){
            System.out.println("minimum number is "+a);
        } else if (b<a&&b<c) {
            System.out.println("minimum number is "+b);
        }else {
            System.out.println("minimum number is "+c);
        }
    }

    static void max(int a, int b, int c){

        if(a>b&&a>c){
            System.out.println("maximum number is "+a);
        } else if (b>a&&b>c) {
            System.out.println("maximum number is "+b);
        }else {
            System.out.println("maximum number is "+c);
        }

    }

}
