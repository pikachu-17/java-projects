import java.util.*;
public class binary
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int years[]={2000, 2001, 2002, 2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010};
        int start=0;
        int end=years.length-1;
        
        System.out.println("Enter the year to be searched");
        int y=sc.nextInt();
        
        while(end>=start)
        {
            int mid=(start+end)/2;
            
            if(years[mid]==y)
            {
                System.out.println("it is present at the location");
                break;
                
            }
            
            else if(years[mid]>=y)
            end=end-1;
            else if(years[mid]<=y)
            start=start+1;
        }
        if(start<end)
        System.out.println("Record does not exist");
    
        }
    }
    


