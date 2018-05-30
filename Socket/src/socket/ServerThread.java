package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerThread extends Thread {
	Socket socket;
	
	public ServerThread(Socket socket) {
		this.socket=socket;
	}
	public void run() {
		String line;
		OutputStream os=null;
		OutputStreamWriter osw=null;
		InputStream is=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		PrintWriter pw=null;
		
		try {
			os = socket.getOutputStream();
			osw=new OutputStreamWriter(os);
			pw=new PrintWriter(osw);
			pw.write("hello,client!");
			pw.flush();
			socket.shutdownOutput();
			is=socket.getInputStream();
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(is!=null)
					is.close();
				if(isr!=null)
					isr.close();
				if(br!=null)
					br.close();
				if(pw!=null)
					pw.close();
				if(osw!=null)
					osw.close();
				if(os!=null)
					os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
