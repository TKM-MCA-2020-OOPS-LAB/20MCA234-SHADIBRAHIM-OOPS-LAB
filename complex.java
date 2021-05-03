import java.util.*;
public class complex {
public static void main(String args[])
{
    int c1,i1,c2,i2,c3,i3;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the real part of first complex number");
    c1=s.nextInt();
    System.out.println("Enter the imaginary part of first complex number");
    i1=s.nextInt();
    System.out.println("Enter the real part of second complex number");
    c2=s.nextInt();
    System.out.println("Enter the imaginary part of second complex number");
    i2=s.nextInt();
    System.out.println("The complex numbers are \n");
    System.out.println("First complex number ="+c1+"+"+i1+"i");
    System.out.println("second complex number ="+c2+"+"+i2+"i");
    c3=c1+c2;
    i3=i1+i2;
    System.out.println("Sum of the complex numbers are ="+c3+"+"+i3+"i");

}


    
}
