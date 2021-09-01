package co4_pack;
import java.util.HashSet;

public class hashset_16 {
	public static void main(String[] args)
	{
	 HashSet<String> hash_set = new HashSet<String>();
     hash_set.add("Shad");
     hash_set.add("Robin");
     hash_set.add("Nihal");
     hash_set.add("Nithin");

     HashSet<String>hash_set2 = new HashSet<String>();
     hash_set2.add("Shad");
     hash_set2.add("Amjiyad");
     hash_set2.add("Nihal");
     hash_set2.add("Rasik");
     
     System.out.println("Comparing the two hash sets");
     
     HashSet<String>result_set = new HashSet<String>();
    for (String element : hash_set)
    {
        System.out.println(hash_set2.contains(element) ? "Sets are same:Yes" : "Sets are same:No");
     }      
}
}
