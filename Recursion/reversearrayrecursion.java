package programs;

public class reversearrayrecursion {
    public static void main(String args[])
    {
        int arr[]={1,2,3,4};
        print(f(arr,0,arr.length-1));
    }
    public static int[] f(int[] arr,int l,int r)
    {
        if(l>r)
            return arr;
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        f(arr,l+1,r-1);
        return arr;
    }
    public static void print(int[] arr)
    {
        for(int i:arr)
            System.out.print(i+" ");
    }
}
