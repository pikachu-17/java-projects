

public class FibonacciReattempt {
    public static void main(String[] args) {
        int a =0;
        int b=1;
        System.out.print(a +" , "+ b+" , ");
        for(int i =0; i<20;i++) {
            int c =b+a;
            a=b;
            b=c;
            System.out.print(c+" , ");
        }


    }
}
