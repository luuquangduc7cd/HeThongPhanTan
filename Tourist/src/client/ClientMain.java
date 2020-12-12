package client;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) throws UnknownHostException, IOException {
		int x = 3, y = 3;
		Client client = new Client();
		String result = client.requestNearestLocation(x, y);
		System.out.println(result);
	}

}
