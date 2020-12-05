package clientpkg;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientApplication {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Scanner sc = new Scanner(System.in); 
		Client client = new Client();
		String cmd = sc.nextLine();
		String res = client.request(cmd);
		System.out.println(res);
	}

}
