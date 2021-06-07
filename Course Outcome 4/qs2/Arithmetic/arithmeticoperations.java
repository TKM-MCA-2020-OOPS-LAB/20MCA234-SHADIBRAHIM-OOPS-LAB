package Arithmetic;
import java.util.Scanner;
interface cal
{
    void add();
    void sub();
    void mul();
    void div();
}

public class arithmeticoperations implements cal 
{
    Scanner sc=new Scanner(System.in);
    
    public void add()
    {
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();
        System.out.println("Sum="+(a+b));
        
    }
    public void sub()
    {
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();
        System.out.println("Difference="+(a-b));
        
    }
    public void mul()
    {
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();
        System.out.println("Product="+(a*b));
        
    }
    public void div()
    {
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();
        System.out.println("Quotient="+(a/b));
        
    }
}
