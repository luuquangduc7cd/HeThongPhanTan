package server;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Application {

	public static void main(String[] args) throws RemoteException, MalformedURLException, AlreadyBoundException {
		ServerRMI server = new ServerRMI();
		LocateRegistry.createRegistry(4444);
		Naming.bind("rmi://localhost:4444/calc", server);
		System.out.println("Server is started!");
	}

}
