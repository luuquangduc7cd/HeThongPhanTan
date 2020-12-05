package serverkg;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	private MyDatabase db;
	private int PORT = 4444;
	private ServerSocket server;
	public Server() throws IOException {
		db = new MyDatabase();
		server = new ServerSocket(PORT);
		System.out.println(String.format("Server is running at port: %d", PORT));
	}
	
	public void listen() {
		while(true) {
			try {
				Socket client = server.accept();
				System.out.println("New client");
				
				InputStream is = client.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);
				
				OutputStream os = client.getOutputStream();
				DataOutputStream dos = new DataOutputStream(os);
							
				String cmd = br.readLine();
				System.out.println(cmd);
				
				String result = db.get(cmd);;
				dos.writeBytes(result);
				client.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
