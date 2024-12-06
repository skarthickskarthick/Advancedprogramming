package programs;

public class decodeways {
    public static void main(String args[])
    {

        System.out.println(rec("122016"));
    }
    public static int rec(String up)
    {
        if(up.isEmpty())


            return 1;

        if(up.startsWith("0"))
            return 0;

        int count1=  rec(up.substring(1));
        int count2=0;
        if(up.length()>=2&&Integer.parseInt(up.substring(0,2))<=26)//for inputs like 27
          count2=rec(up.substring(2));
        return count1+count2;

    }
}
