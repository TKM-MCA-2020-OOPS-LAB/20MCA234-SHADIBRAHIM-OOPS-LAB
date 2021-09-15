import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class writefile {

		 public static void main(String[] args) {

		  try
		  {
	          FileWriter writer = new FileWriter("D:\\20MCA234-SHADIBRAHIM-OOPS-LAB-main\\Course Outcome 6\\sample.txt",true);
	          writer.write("This is in addition to the above text ...hai people!!");
	          writer.close();
	          
	          FileReader reader = new FileReader("D:\\20MCA234-SHADIBRAHIM-OOPS-LAB-main\\\\Course Outcome 6\\\\sample.txt");
	          BufferedReader br= new BufferedReader(reader);
	          
	          String str;
	          System.out.println("**Displaying the contents of the file** ");
	          while ((str = br.readLine()) != null) 
	          {
	              System.out.println(str);
	          }
	          reader.close();

	      } 
		  catch (IOException e) 
		  {
	          System.out.println(e.getMessage());
	      }

	  }
    }
