import java.util.*;
public class threadtest {
    public static void main(String args[]) throws InterruptedException 
    {
        ThreadA at=new ThreadA();
        Thread a=new Thread(at);
        ThreadB bt=new ThreadB();
        Thread b=new Thread(bt);
        a.start();
        a.sleep(200);
        b.start();
        b.sleep(200);
    }
    
}
class ThreadA implements Runnable
{
    public void run()
    {
        int i,f=1,s=1,t,n=10;
        System.out.println("\nFibonacci Series"+"\n"+"------------------------------");
        System.out.println(f);
        System.out.println(s);
        for(i=3;i<=n;i++)
        {
            t=f+s;
            System.out.println(t);
            f=s;
            s=t;
        }
        System.out.println("\n");
    }
}
class ThreadB implements Runnable{
    public void run()
    {
        int i;
        System.out.println("Print Even numbers"+"\n"+"----------------------");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit");
        int n2=sc.nextInt();
        System.out.println("Print even numbers between 1 to "+n2+":");
        for(i=1;i<=n2;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }

    }

    
}
