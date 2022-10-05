import java.util.Scanner;

public class LargestNumberinInfiniteNumbers {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int largest =0;
        while (true){
            int a = scan.nextInt();
            if(a>largest){
                largest = a;
            }

            if(a==0){
                break;
            }
        }
        System.out.println("Largest Number is: "+largest);
    }
}
