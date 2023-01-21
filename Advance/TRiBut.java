package Advance;
import java.util.*;

public class TRiBut {
   public static void main(String[] args)
   {
    Scanner sc = new Scanner(System.in);
    int n,i,j,k;
    System.out.println("Enter the value of n: ");
    n= sc.nextInt();
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=i;j++)
        {
            System.out.print(j+" ");
        }
        for(k=1;k<=2*(n-i);k++)
        {
            System.out.print(" ");
        }
        for(j=1;j<=i;j++)
        {
            System.out.print(j+" ");
        }
        System.out.println(" ");
    }//Upper of Butterfly//
   for(i=n;i>=1;i--)
   {
    for(j=1;j<=i;j++)
    {
        System.out.print(j+" ");
    }
    for(k=1;k<=2*(n-i);k++)
    {
        System.out.print(" ");
    }
    for(j=1;j<=i;j++)
    {
        System.out.print(j+" ");
    }
    System.out.println(" ");
   }
   //Upper portion//
   for(i=n;i>=1;i--)
   {
      for(j=1;j<=i;j++)
      {
          System.out.print(j+" ");
      }
      for(k=1;k<=2*(n-i);k++)
      {
          System.out.print(" ");
      }
      //2nd part of this code //
      for(j=1;j<=i;j++)
      {
          System.out.print(j+" ");
      }
      System.out.println(" ");
   }
   //Lower-portion//
   for(i=1;i<=n;i++)
   {
      for(j=1;j<=i;j++)
      {
          System.out.print(j+" ");
      }
      for(k=1;k<=2*(n-i);k++)
      {
          System.out.print(" ");
      }
      //System.out.println(" ");
      for(j=1;j<=i;j++)
      {
          System.out.print(j+" ");
      }
      System.out.println(" ");
   }
  }
   }

