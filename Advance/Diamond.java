package Advance;
import java.util.*;
public class Diamond {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n,i,j,k;
        System.out.println(" Enter the value for the diamond : ");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            for(k=1;k<=(2*i-1);k++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(i=n;i>=1;i--)
        {
            for(j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            for(k=1;k<=(2*i-1);k++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
