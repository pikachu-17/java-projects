import java.util.Scanner;

public class SumofInfiniteNumbers {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int sum =0;
        while(true){
             int a = scan.nextInt();
            sum +=a;
            if(a==0){
                break;
            }
        }
        System.out.print("Sum of Entered Numbers are: "+sum);


    }
}
