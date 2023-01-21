import java.util.*;
public class BinaryTri {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n,i,j;
        System.out.println(" Enter the ending value : ");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                int sum;
                sum=i+j;
                if(sum%2!=0)
                {
                  System.out.print(" 1 ");
                }
                else
                {
                    System.out.print(" 0 ");
                }
            }
            System.out.println(" ");
        }
    }
}
