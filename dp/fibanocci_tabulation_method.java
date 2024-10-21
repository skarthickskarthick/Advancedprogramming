package dp;

public class fibanocci_tabulation_method {
    public static void main(String args[])
    {
        int n=5;
        int f=0,s=1,temp=f+s;
        if(n==1)
            temp=0;

        for(int i=3;i<=n;i++)
        {
            temp=f+s;
            f=s;
            s=temp;

        }
        System.out.print(temp);
    }
}
