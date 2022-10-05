 public class Pattern
        {
            public static void main(String[] args)
            {
                System.out.println("The star pattern is... ");
                for (int m=1; m<=3; m++)
                {
                    for (int p=1; p<=(m * 2) -1; p++)
                    {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                for (int m=2; m>=1; m--)
                {
                    for (int p=1; p<=(m * 2) -1; p++)
                    {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }