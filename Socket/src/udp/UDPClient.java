package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class UDPClient {

	public static void main(String[] args) throws IOException {
		InetAddress inet=InetAddress.getByName("localhost");
		
		byte []data="Successful!".getBytes();
		
		DatagramPacket packet=new DatagramPacket(data, data.length, inet, 8080);
		DatagramSocket socket=new DatagramSocket();
		
		socket.send(packet);
		
		
		byte []data1=new byte[1024];
		DatagramPacket packet1=new DatagramPacket(data1, data1.length);
		socket.receive(packet1);
		String string=new String(data1,0,packet1.getLength());
		System.out.println(string);
		socket.close();
		
		
	}

}
