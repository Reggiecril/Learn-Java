package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ServerThread extends Thread{
	DatagramSocket socket=null;
	DatagramPacket packet=null;
	
	public ServerThread(DatagramSocket socket,DatagramPacket packet) {
		this.socket=socket;
		this.packet=packet;
	}
	public void run() {
		try {
			byte []data=new byte[1024];
	
			InetAddress inet=packet.getAddress();
			data="Server messsage!".getBytes();
			DatagramPacket packet1=new DatagramPacket(data, data.length,inet,packet.getPort());
			socket.send(packet1);
		} catch (IOException e) {
				// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
