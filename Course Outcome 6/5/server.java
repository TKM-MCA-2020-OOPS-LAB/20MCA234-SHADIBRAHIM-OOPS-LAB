package CO6;
import java.net.*;
import java.io.*;
public class server {
public static void main(String[] args) throws Exception {
// TODO Auto-generated method stub
try {
ServerSocket ss = new ServerSocket(2665);
System.out.println("Server is waiting for the client	");
Socket s = ss.accept();
System.out.println("CONNECTION ESTABLISHED !!!");
InputStreamReader isr = new InputStreamReader(s.getInputStream());
BufferedReader br = new BufferedReader(isr);
String str = br.readLine();
System.out.println("Message from Client: "+str);
}
catch(Exception e) {
System.out.println("An error occured.."+e);
}
}
}
