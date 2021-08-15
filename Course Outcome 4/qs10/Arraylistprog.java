import java.util.ArrayList;
import java.util.Collections;
public class Arraylistprog {
    public static void main(String[] args) {
		
		// Creating ArrayList of type "String" which means we can only add "String" elements
		
		 ArrayList<String> obj = new ArrayList<String>();
		 
		 //adding elements to an ArrayList
		 
	      obj.add("red");
	      obj.add("black");
	      obj.add("green");
	      obj.add("yellow");
	       
	      // Displaying elements
	      
	      System.out.println("\n Original ArrayList:");
	      for(String str:obj)
	         System.out.println(str);

	      //Add element at the given index or replace
	       
	      obj.add(1, "majanda");

	      // Displaying elements
	      
	      System.out.println("\n ArrayList after add operation:");
	      for(String str:obj)
	         System.out.println(str);

	      //Remove elements from ArrayList 
	      
	      obj.remove("green");
	     
	      // Displaying elements
	      
	      System.out.println("\n ArrayList after remove operation:");
	      for(String str:obj)
	         System.out.println(str);

	      //Remove element from the specified index
	      
	      obj.remove(3); 

	      // Displaying elements
	      
	      System.out.println("\n Final ArrayList:");
	      for(String str:obj)
	         System.out.println(str);
	      
	      //Sorting the ArrayList
	      
	      Collections.sort(obj);
	      
	      System.out.println("\n  ArrayList after sorting:");
	      for (String str : obj) 
	         System.out.println(str);
	
	
	      //returns the object of list which is present at the specified index
	         
	      // obj.get(2);
	      
	      System.out.println("\n Object at index 2:"+obj.get(2));
	     
	      // Checks whether the object is in the ArrayList
	      
	      // obj.contains();
	      
	      System.out.println("\n violet is in the ArrayList :"+obj.contains("violet"));
	      System.out.println("\n red is in the ArrayList :"+obj.contains("red"));
	      
	      //Size of the ArrayList
	      
	       //obj.size();
	      
	      System.out.println("\n Size of the ArrayList:"+obj.size());
	      
	      // remove ArrayList
	      
	      obj.clear();
	      
	      System.out.println("\n** ArrayList Removed **");
	      
	
	}

    
}
