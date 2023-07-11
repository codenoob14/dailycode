import java.util.*;
class dailycode2 
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        } 
        System.out.println(product(a,n));
    }
    public static String product(int a[],int n)
    {
        int b[]=new int[n];
        int pro = 1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j!=i)
                    pro*=a[j];

            }
            b[i]=pro;
            pro=1;

        }
        return Arrays.toString(b);
    }

    
}
