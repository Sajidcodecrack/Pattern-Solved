import java.util.*;
import java.lang.*;
public class RTriangle {
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
         int n,i,j;
         System.out.println("Enter an ending value : ");
         n=sc.nextInt();
         for(i=1;i<=n;i++)
         {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
         }
    }
}
