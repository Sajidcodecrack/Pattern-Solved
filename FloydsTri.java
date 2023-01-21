import java.util.*;
public class FloydsTri {
    public static void main(String[] args)
    {
      Scanner sc= new Scanner(System.in);
      int n,i,j;
      int num=1;
      System.out.println("Enter any number : ");
      n=sc.nextInt();
      for(i=1;i<=n;i++)
      {
        for(j=1;j<=i;j++)
        {
            System.out.print(num+" ");
            num++;
        }
        System.out.println(" ");
      }
    }
}
