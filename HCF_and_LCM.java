import java.util.Scanner;

public class HCF_and_LCM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers to find HCF and LCM: ");
        int a = scan.nextInt();
        int b = scan.nextInt();

        int lcm = lcm(a,b);
        int hcf = hcf(a,b);
        System.out.println("HCF: " + hcf + " and LCM: " + lcm);

    }
    static int hcf(int a,int b){
        int min = 0;
        if(a>b)
            min =b;
        else
            min =a;
        for(int i=min; i>=2;i--){
            if(a%i==0 && b%i==0){
             return i;
            }
        }
        return 0;
    }
    static int lcm(int a,int b){
        int max = 0;
        if(a<b)
            max=b;
        else max=a;
       for(int i =max;i<=a*b;i++) {
           if (i % a == 0 && i % b == 0)
               return i;
       }
       return 0;
    }
}
