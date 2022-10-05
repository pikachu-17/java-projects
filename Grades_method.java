import java.util.Scanner;

public class Grades_method {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Marks: ");
        int marks = scan.nextInt();
        grade(marks);
    }

    static void grade(int marks) {
        String grade = null;
        if(marks<=100){
             if(marks>90&&marks<=100){
                 grade="AA";
             }
             else if(marks>80&&marks<=90){
                 grade="AB";
             }
             else if(marks>70&&marks<=80){
                 grade="BB";
             }             else if(marks>60&&marks<=70){
                 grade="BC";
             }             else if(marks>50&&marks<=60){
                 grade="CD";
             }             else if(marks>40&&marks<=50){
                 grade="DD";
             }
             else if(marks<=40){
                 grade="Fail";
             }
         }
        else{
            System.out.println("Enter correct Marks Please!!");
        }
        System.out.println("Grade of Student is: "+grade);
   
    }
}
