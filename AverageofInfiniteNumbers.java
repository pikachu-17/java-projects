import java.util.Scanner;

public class AverageofInfiniteNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count =0;
        int sum = 0;
        while (true){

            float a = scan.nextFloat();
            if (a==0){
                break;
            }
            sum+=a;
            count++;

        }
        float avg = sum/count;
        System.out.println("Average of given numbers are: "+avg);
    }
}
