package programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class rope_cutting_problem {
    public static void main(String args[])
        {
            // code here
            int n=14;
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=i+1;
            }
            long max[]=new long[1];
            max[0]=0;

            f(0,arr,n,new Stack<>(),max);
            System.out.println(max[0]);
        }
        public static void f(int in,int[] arr,int target,Stack<Integer> ds ,long[] max)
        {
            if(in==arr.length) {
                return;
            }
                if(target==0&& ds.size() > 1)

                {
                    long p=1;
                    for(int i=0;i<ds.size();i++)
                    {
                        p*=ds.get(i);
                    }
                    max[0]=Math.max(max[0],p);
                    return;
                }





            if(arr[in]<=target)
            {
                ds.push(arr[in]);
                f(in,arr,target-arr[in],ds,max);
                ds.pop();
            }
            f(in+1,arr,target,ds,max);


        }
    }

