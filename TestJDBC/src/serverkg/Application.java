package serverkg;

import java.io.IOException;

public class Application {

	public static void main(String[] args) throws IOException {
		Server svr = new Server();
		svr.listen();
	}

}
