package lab5;
import java.net.*;
public class UdpServer {
public static void main(String args[]) throws Exception{
		DatagramSocket Socket = new DatagramSocket();
	String data="Hello!!";
	byte[]bData= data.getBytes();
	DatagramPacket db= new DatagramPacket(bData,bData.length,InetAddress.getByName("localhost"),7777);
	Socket.send(db);
System.out.println("Data send...");
Socket.close();
}
}
