package co4_pack;
import java.util.*;
public class map_17 {
	public static void main(String args[])
    {
       
        Map<Integer, String> mp = new HashMap<>(); 
        //Inserting
        System.out.println("Enter the limit:");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("Enter the rollno and name:");
        while(n!=0) {
        	
        	int x= sc.nextInt();
        	String s= sc.next();
        	mp.put(x, s);
        	n--;
        }
        
        System.out.println("Initial Map:"+mp);
        mp.put( (34), "Shad"); 
        //Updating
        System.out.println("Updated Map:"+mp);
        //Removing
        System.out.println("Enter the Roll number to be removed:");
        int r=sc.nextInt();
        mp.remove(r);  
        // Final Map      
        System.out.println("Final Map:"+mp);
    
    }
}
