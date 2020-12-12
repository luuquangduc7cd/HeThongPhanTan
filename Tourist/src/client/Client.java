package client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	private Socket connection;
	private final String HOST = "localhost";
	private final int PORT = 3000;
	
	public Client() throws UnknownHostException, IOException {
		connection = new Socket(HOST, PORT);
		System.out.println(String.format("Connected to: %s:%d", HOST, PORT));
	}
	public String requestNearestLocation(int x, int y) {
		String cmd = String.format("%d:%d", x, y);
		try {
			OutputStream os = connection.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			dos.writeBytes(cmd+"\n");
			InputStream is = connection.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			String temp = dis.readLine();
			return temp;
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}
}
