import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         String text = input.next();
         String rev="";
         for(int i=text.length()-1;i>=0;i--){
             rev=rev+text.charAt(i);
             }
         if(text.toLowerCase().equals(rev.toLowerCase())){
             System.out.println(text+" is a palindrome!");
         }
         else {
             System.out.println(text+" is not a palindrome");
         }

    }
}
