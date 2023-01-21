package Advance;
import java.util.*;
public class PallendromicPyramid {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n,i,j,k;
        System.out.println(" Enter the value of n : ");
        n= sc.nextInt();
        for(i=1;i<=n;i++)
        {
           for(j=1;j<=(n-i);j++)
           {
            System.out.print(" ");
           }
           for(k=i;k>=1;k--)
           {
            System.out.print( k );
           }
           //Second -Half//
           for(k=2;k<=i;k++)
           {
            System.out.print( k );
           }
           System.out.println(" ");
           
        }
        
       
    }
}
