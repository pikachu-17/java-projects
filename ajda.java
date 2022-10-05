import java.util.*;
public class bubble
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the numbers");
        
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j+1]<arr[j])
                {
                    
                
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
            }
        }
        System.out.println("the numbers in ascending order are");
        for (int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
            
        }
    }
}
