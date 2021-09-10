import java.util.*;
public class searching {
    public static void main(String[] args) {
		int n,key,flag=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of array elements: ");
		n=s.nextInt();
		int []a=new int[n];
		Scanner r=new Scanner(System.in);
		System.out.println("Enter the array elemnts: ");
		for(int i=0;i<n;i++)
		{
			a[i]=r.nextInt();
		}
		
		System.out.println("Enter the element to be searched: ");
		Scanner t =new Scanner(System.in);
		key=t.nextInt();
		
		for(int i=0;i<n;i++)
		{
			if(a[i]==key)
			{
				System.out.println("Element "+key+" is found at "+ (i+1)+ " position");
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Element"+key+"not found");
		}
	}

}
    

