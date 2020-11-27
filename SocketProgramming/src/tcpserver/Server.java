package tcpserver;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	ServerSocket server;
	Supporter sp;
	public Server() throws IOException {
		server = new ServerSocket(4444);
		sp = new Supporter();
	}
	
	public void listen() throws IOException {
		while(true) {
			Socket client = server.accept();
			DataInputStream input = new DataInputStream(client.getInputStream());
			DataOutputStream output = new DataOutputStream(client.getOutputStream());
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(output));
			String cmd = input.readLine();
			String res = getResult(cmd);
			bw.write(res);
			client.close();
		}
	}
	
	private String getResult(String cmd) {
		String result = "";
		String command = cmd.split("(")[0];
		int deg = Integer.parseInt(cmd.substring(3, cmd.length()-2));
		if(command.equalsIgnoreCase("sin"))
			result = String.format("Sin(%d) = %.2f", deg, sp.getSin(deg));
		else if(command.equalsIgnoreCase("cos"))
			result = String.format("Cos(%d) = %.2f", deg, sp.getCos(deg));
		else if(command.equalsIgnoreCase("cos"))
			result = String.format("Tan(%d) = %.2f", deg, sp.getTan(deg));
		else if(command.equalsIgnoreCase("cos"))
			result = String.format("Cot(%d) = %.2f", deg, sp.getCot(deg));
		else 
			result = "Undefine";
		return result;
	}
}
