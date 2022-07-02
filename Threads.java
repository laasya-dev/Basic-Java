import java.util.*;
class prefix extends Thread
{
    String s1;
    prefix(String s)
    {
        s1=s;
    }
    public void run()
    {
        System.out.println("The prefix string: ");
        int len=s1.length();
        for(int i=0;i<=len;i++)
        {
            System.out.println(s1.substring(0, i));
        }
    }
}
class suffix extends Thread
{
    String s1;
    suffix(String s)
    {
        s1=s;
    }
    public void run()
    {
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException e){}
        System.out.println("\nThe suffix string: ");
        int len=s1.length();
        for(int i=len-1;i>=0;i--)
        {
            System.out.println(s1.substring(i, len));
        }
    }
}
public class Threads 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str=sc.next();
        prefix p=new prefix(str);
        suffix s=new suffix(str);
        p.start();
        s.start();
    }
}