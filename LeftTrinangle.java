import java.util.*;
public class LeftTrinangle {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       int n,i,j,k;
       System.out.println("Enter any number for execuation :");
       n=sc.nextInt();
       for(i=1;i<=n;i++)
       {
        for(j=1;j<=n-i;j++)
        {
            System.out.print(" ");
        }
        for(k=1;k<=i;k++)
        {
            System.out.print("*");
        }
        System.out.println(" ");
       }
    }
}
