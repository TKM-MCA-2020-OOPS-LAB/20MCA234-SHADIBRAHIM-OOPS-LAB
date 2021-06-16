import java.util.*;
public class thread {
    public static void main(String args[])throws InterruptedException
    {
        ThreadA a=new ThreadA();
        ThreadB b=new ThreadB();
        a.start();
        a.sleep(200);
        b.start();
        b.sleep(200);


    }
    
}
class ThreadA extends Thread
{
    public void run()
    {
        int n=5;
        System.out.println("Multiplication table Of 5***\n"+"\n"+"----------------------------");
        for(int i=1;i<=10;i++)
        {
            
            System.out.println("\t"+n+"X"+i+"="+n*i);
        }
        System.out.println("\n-------------------------------\n");
    }
}
class ThreadB extends Thread
{

    public void run()
    {
        int i,count,j;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the limit:");
        int l = s.nextInt();
    System.out.println("Prime numbers between 1 and " + l + " are:");
    for(i=1;i<=l;i++)
    {
        count=0;
        for(j=1;j<=i;j++)
        {
            if(i%j==0)
            {
            count++;
                
            }
        }
        if(count==2)
        {
            System.out.println(i);
        }
    }

    }
    }
    
