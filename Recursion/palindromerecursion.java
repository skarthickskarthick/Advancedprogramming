package programs;

public class palindromerecursion {
    public static void main(String args[])
    {
        String s="malayalamaq";
       System.out.println(f(s,0,s.length()-1));

    }
    public static boolean f(String s,int l,int r)
    {
        if(l>r)
            return false;
        if(s.charAt(l)==(s.charAt(r)))
            return true;
        f(s,l+1,r-1);
        return false;
    }
}
