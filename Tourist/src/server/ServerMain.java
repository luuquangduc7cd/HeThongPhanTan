package server;

import java.io.IOException;

public class ServerMain {

	public static void main(String[] args) throws IOException {
		Server svr = new Server();
		svr.listen();
	}

}
