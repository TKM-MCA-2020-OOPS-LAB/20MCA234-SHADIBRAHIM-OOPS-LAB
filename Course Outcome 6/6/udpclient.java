package co6;

import java.io.*;
import java.net.*;

public class udpclient {
    public static void main(String[] args) throws IOException {
        DatagramSocket client= new DatagramSocket();
        InetAddress add=InetAddress.getByName("localhost");
        String str ="Ping from Client!!!";
        byte[] bufBytes = str.getBytes();
        DatagramPacket datagramPacket=new DatagramPacket(bufBytes,bufBytes.length,add,4220);
        client.send(datagramPacket);
        client.close();
    }

}

