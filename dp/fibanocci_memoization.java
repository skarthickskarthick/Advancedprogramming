package dp;

import java.util.Arrays;

public class fibanocci_memoization {


    public static void main(String args[])
    {
        int n=3;
        int dp[]=new int[n+1]; //n+1 because index starts at 0

       System.out.print(fib(n,dp));
       //System.out.println(Arrays.toString(dp));
    }
    static int fib(int n,int[] dp)
    {

        if(n<=1)
            return n;
       if(dp[n]!=0)
            return dp[n];
        return dp[n]=fib(n-1,dp)+fib(n-2,dp);
    }
}
