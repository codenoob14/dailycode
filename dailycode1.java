import java.util.*;
class dailycode
{
    public static boolean sum(int a[],int n,int k){
      for( int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]+a[j]==k)

                    return true; 
                       
            }

        }
        return false;

    }
    
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]=new int [n];
        int k=sc.nextInt();
        for(int i=0;i<n;i++)
        {
             a[i] = sc.nextInt();
        }
        System.out.println(sum(a,n,k));
      
    }
}