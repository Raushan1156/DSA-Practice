import java.util.*;

public class Stock{
    public static void main(String [] args)
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int stock[]=new int[n];
        for(int i=0;i<n;i++)
            stock[i]=sc.nextInt();

            stock_val sv= new stock_val();
            System.out.println("maximum profit= "+sv.maximumProfit(stock,n));
    }
}

class stock_val
{

    int maximumProfit(int a[],int n)
    {
        int maxProfit=0;
        int minCost=a[0];
        for(int i=0;i<n;i++)
        {
            // if(minCost>a[i])
            //     minCost=a[i];
             // or
             
            minCost=Math.min(minCost,a[i]);   
            int profit=a[i]-minCost;
            maxProfit=Math.max(maxProfit,profit);  
            //System.out.print(maxProfit);    
        }
     return maxProfit;
    }
}
