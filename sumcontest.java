import java.util.Scanner;
    import java.io.*;
import java.util.Scanner;

    public class sumcontest {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner scan = new Scanner(System.in);
            int t=0;
            int n = scan.nextInt();
            do{
                int even=0;
                int odd =0;
                for(int i =1;i<=n;i++){
                    if(n%2==0){
                        even++;
                    }
                    else{
                        odd++;
                    }
                }
                if(odd > even){
                    System.out.println("YES");
                }
                else if(even >= odd){
                    System.out.println("NO");
                }
                t++;
            }while(t<n);
        }
    }