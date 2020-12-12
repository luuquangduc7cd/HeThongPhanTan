package server;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	private LocationManagement location;
	private ServerSocket svr;
	private final int PORT = 3000;

	public Server() throws IOException {
		location = new LocationManagement();
		svr = new ServerSocket(PORT);
	}

	public void listen() {
		System.out.println("Server is listening at port: " + PORT);
		while(true) {
			try {
				Socket client = svr.accept();
				System.out.println("New connection from ip: " + client.getInetAddress());

				InputStream is = client.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);

				OutputStream os = client.getOutputStream();
				DataOutputStream dos = new DataOutputStream(os);

				String cmd = br.readLine();
				int x = Integer.parseInt(cmd.split(":")[0]);
				int y = Integer.parseInt(cmd.split(":")[1]);

				String result = location.getNearestLocationFrom(x, y);
				dos.writeBytes(result);
				client.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
}
