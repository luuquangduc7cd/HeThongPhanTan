package tcpserver;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Scanner scn = new Scanner(System.in);
		String cmd = scn.nextLine();
		Socket socket = new Socket("localhost", 4444);

	}

}
