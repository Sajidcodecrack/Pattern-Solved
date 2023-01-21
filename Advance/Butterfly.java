package Advance;
import java.util.*;
public class Butterfly {
    public static void main(String[] args)
    {
     Scanner sc= new Scanner(System.in);
     int n,i,j,k;
     System.out.println(" Enter the ending value to draw a butter fly : ");
     n= sc.nextInt();
     //Upper portion//
     for(i=n;i>=1;i--)
     {
        for(j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        for(k=1;k<=2*(n-i);k++)
        {
            System.out.print(" ");
        }
        //2nd part of this code //
        for(j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println(" ");
     }
     //Lower-portion//
     for(i=1;i<=n;i++)
     {
        for(j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        for(k=1;k<=2*(n-i);k++)
        {
            System.out.print(" ");
        }
        //System.out.println(" ");
        for(j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println(" ");
     }
    }
    
}
