package Graphics;
import java.util.*;
interface calculation
{
    void carea();
    void rarea();
    void tarea();
    void sarea();

}



public class Shapes implements calculation
{
    Scanner s=new Scanner(System.in);
    public void carea()
    {
        System.out.println("Enter the radius");
        int r=s.nextInt();
        System.out.println("Area of Circle ="+3.14*r*r);
    }
    public void rarea()
    {
        System.out.println("Enter length:");
        int l=s.nextInt();
        System.out.println("Enter breadth:");
        int b=s.nextInt();
        System.out.println("Area of Rectangle:"+(l*b));
    }
    public void tarea()
    {
        System.out.println("Enter the base:");
		int b = s.nextInt();
		
		System.out.println("Enter the height:");
		int h = s.nextInt();
		
		System.out.println("Area of the triangle  ="+(0.5*b*h));
    }
    public void sarea()
    {
        System.out.println("Enter the side:");
		int side = s.nextInt();
		
		System.out.println("Area of the square ="+(side*side));
    }
}
