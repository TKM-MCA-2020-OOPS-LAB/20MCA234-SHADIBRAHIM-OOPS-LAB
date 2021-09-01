package co4_pack;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;

public class set_15 {
	public static void main(String[] args) {

		Set<Integer> s= new LinkedHashSet<Integer>();
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of elements to be added: ");
		n=sc.nextInt();
		System.out.println("Enter set elements: ");
		while(n!=0)
		{
			int x=sc.nextInt();
			s.add(x);
			n--;
		}
		System.out.println("Displaying set:"+s);
		System.out.println("Size of set: "+s.size());
		System.out.println("Enter element to be deleted:");
		int d=sc.nextInt();
		
		if(s.remove(d))
		{
			System.out.println("Set after removal:"+s);
		}
		else
		{
			System.out.println("Element not found!!");
		}
	}
}
