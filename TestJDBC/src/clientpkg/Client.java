package clientpkg;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	private Socket client;
	private final String HOST = "localhost";
	private final int PORT = 4444;
	public Client() throws UnknownHostException, IOException {
		client = new Socket(HOST, PORT);
		System.out.println(String.format("Connected to %s:%d", HOST, PORT));
	}
	public boolean isConnecting() {
		return !client.isClosed();
	}
	private void exit() throws IOException {
		client.close();
	}
	public String request(String cmd) {		
		try {
			OutputStream os = client.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			dos.writeBytes(cmd+"\n");
			InputStream is = client.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			String temp = dis.readLine();
			return temp;
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}
}
