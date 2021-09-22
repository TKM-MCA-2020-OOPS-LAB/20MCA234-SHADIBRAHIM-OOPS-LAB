import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class evenodd {

	    public static void main(String[] args) throws IOException 
	    {
	        FileInputStream source = new FileInputStream ("C:\\Users\\intruder\\Desktop\\file\\source.txt");
	        FileOutputStream odd = new FileOutputStream ("C:\\Users\\intruder\\Desktop\\file\\odd.txt");
	        FileOutputStream even = new FileOutputStream ("C:\\Users\\intruder\\Desktop\\file\\even.txt");
	        int i;
	        while((i = source.read()) != -1){
	            if(i%2==0) 
	            {

	                even.write(i);
	            }
	            else 
	            {
	                odd.write(i);
	            }
	        }
	        System.out.println("copied");
	        source.close();
	        even.close();
	        odd.close();



	    }


}
