import java.util.Scanner;
//not working
public class nCr_and_nPr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n and r respectively: ");
        int n = scan.nextInt();
        int r = scan.nextInt();
//        int nfact = 1;
//        for(int i=1;i<=n;i++){
//            nfact*=i;
//        }
//        int rfact=1;
//        for(int i =1;i<=r;i++){
//            rfact*=i;
//        }
//        int nminusr=n-r;
//        int nminusrfact =1;
//        for (int i =0;i<=nminusr;i++){
//            nminusrfact*=i;
//        }
        int nfact =factorial(n);
        int nminusrfact =factorial((n-r));
        int rfact=factorial(r);
        int permutation = nfact/nminusrfact;
        int combination = nfact/(rfact*nminusrfact);
        System.out.println("the permutation for given n and r is: "+permutation+" and combination is: "+combination);
    }
    static int factorial(int a){
        int fact =1;
        for(int i =0;i<=a;i++){
            fact*=i;
        }
        return fact;
    }
}
