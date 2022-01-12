// Qn link: https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1

/*  Steps: 
   1) intialise two variable : currentSum=0; maximumSum=0;
   2) traverse the loop once and follow these steps:
        i)add all items of array to currentSum.
        ii) update maximumSum=currentSum, if currentSum>naximumSum.
        iii)and also check currentSum. if currentSum<0, update currentSum=0;



//  Driver Code Starts
    import java.io.*;

    class Main {
        
        public static void main (String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
            while(t-->0){
                //size of array
                int n = Integer.parseInt(br.readLine().trim());
                int arr[] = new int[n];
                String inputLine[] = br.readLine().trim().split(" ");
                
                //adding elements
                for(int i=0; i<n; i++){
                    arr[i] = Integer.parseInt(inputLine[i]);
                }
                
                Solution obj = new Solution();
                
                //calling maxSubarraySum() function
                System.out.println(obj.maxSubarraySum(arr, n));
            }
        }
    }
    
    //  Driver Code Ends
    
    
    class Solution{
    
        // arr: input array
        // n: size of array
        //Function to find the sum of contiguous subarray with maximum sum.
        long maxSubarraySum(int arr[], int n){
            
            // Your code here
            int maxSum=0;
            int currentSum=0;
            for(int i=0;i<n;i++)
            {
                currentSum+=arr[i];
                if(currentSum>maxSum)
                    maxSum=currentSum;
                if(currentSum<0)
                    currentSum=0;
            }
            int maxu=arr[0];
            if(maxSum<=0)
            {
               for(int i=0;i<n;i++)
                    if(arr[i]>maxu)
                        maxu=arr[i];
                return maxu;
            }
                
            return (long)maxSum;
            
        }
        
    }
    
    
