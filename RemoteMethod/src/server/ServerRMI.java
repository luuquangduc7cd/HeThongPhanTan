package server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import support.Caculation;

public class ServerRMI extends UnicastRemoteObject implements Caculation {

	public ServerRMI() throws RemoteException {

	}

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int sub(int a, int b) {
		return a - b;
	}

	@Override
	public int mul(int a, int b) {
		return a * b;
	}

	@Override
	public double div(int a, int b) {
		return 1.0 * a / b;
	}

}
