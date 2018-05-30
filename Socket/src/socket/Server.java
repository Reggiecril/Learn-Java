package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		ServerSocket serverSocket;
		try {
			serverSocket = new ServerSocket(8888);
		System.out.println("等待客户端");
		int count=0;
		while(true) {
			count ++;
			Socket socket=serverSocket.accept();
			ServerThread serverThread=new ServerThread(socket);
			serverThread.start();
			System.out.println("client:"+count+"ip"+socket.getInetAddress().getHostAddress());
		}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
