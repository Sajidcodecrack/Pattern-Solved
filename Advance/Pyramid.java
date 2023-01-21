package Advance;
import java.util.*;
public class Pyramid {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,i,j,k;
        System.out.println("Enter the ending value : ");
        n= sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print( "  ");
            }
            for(k=1;k<=i;k++)
            {
                System.out.print(i+ "  ");
            }
            System.out.println(  "  ");
        }
        //Lower Portion//
        for(i=n;i>=1;i--)
        {
            for(j=1;j<=(n-i);j++)
            {
                System.out.print("  ");
            }
            for(k=1;k<=i;k++)
            {
                System.out.print(i+ "  ");
            }
            System.out.println(  "  ");
        }
    }
}
