package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPServer {

	public static void main(String[] args) throws IOException {
		
			DatagramSocket socket=new DatagramSocket(8080);
			byte []data=new byte[1024];
			DatagramPacket packet=new DatagramPacket(data, data.length);
			
			socket.receive(packet);
			String string=new String(data,0,data.length);
			System.out.println(string);
			int count=0;
			while(true) {
				count++;
				ServerThread thread=new ServerThread(socket,packet);
				thread.start();
			}
	
	}

}
