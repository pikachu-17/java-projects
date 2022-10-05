import java.util.Scanner;

public class Armstrong2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number to check it is armstrong or not: ");
        int a =scan.nextInt();
        int sum =0;
        int rem,origi;
        origi =a;
        while (origi!=0){
            rem = origi%10;
            sum +=Math.pow(rem,3);
            origi=origi/10;
        }
        if(sum == a){
            System.out.println("number is armstrong");}

            else {
                System.out.println("number is not armstrong");
            }
        }
    }

