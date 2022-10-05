import java.util.Scanner;

public class List_of_infinite_numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num=1,negsum=0,evsum=0,oddsum=0;
        System.out.println("Start entering numbers: ");
        while(num!=0){
             num = scan.nextInt();
             if(num<0){
                 negsum+=num;
             }
             else if(num>0&&num%2==0){
                 evsum+=num;
             }
             else if(num>0&&num%2!=0){
                 oddsum+=num;
             }
        }
        System.out.println("sum of negative numbers are: "+negsum+" ,sum of postitive even numbers are: "+evsum+ " and sum of positive odd numbers are: "+oddsum);
        System.out.println("End of program!");
    }
}
