import java.util.*;
public class HollowSquare {
    public static void main(String[] args)
    {
        int n,i,j;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        n= sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(i==1 || j==1 || i==n || j==n )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
           
        }
    }
}
