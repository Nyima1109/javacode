package lab5;
import java.net.*;
public class UdpClient {
public static void main(String args[]) throws Exception{
	DatagramSocket Socket= new DatagramSocket(7777);
	byte[] data=new byte [1024];
	DatagramPacket Packet=new DatagramPacket(data, data.length);
	Socket.receive(Packet);
	String Data= new String (Packet.getData(),0,Packet.getLength());
	System.out.println("Message from server:"+Data);
	Socket.close();
}
}
    