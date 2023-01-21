import java.util.*;
public class RevFloyd {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       int n,i,j;
       int num=15;
       System.out.println("Enter an ending value : ");
       n=sc.nextInt();
       for(i=n;i>=1;i--)
       {
        for(j=1;j<=i;j++)
        {
            System.out.print(num+" ");
            num--;
        }
        System.out.println(" ");
       }
    }
}
