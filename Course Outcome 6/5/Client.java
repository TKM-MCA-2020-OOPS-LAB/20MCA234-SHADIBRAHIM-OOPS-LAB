package CO6; 
import java.net.*; 
import java.io.*;

public class Client {
public static void main(String args[]) throws Exception{
	try {
	Socket s = new Socket ("localhost", 2665);
	PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
	pw.println("Hello");
	pw.flush();
	
	}
	catch(Exception e) {
	System.out.println("An error occured..." +e);
	}
	}
}
