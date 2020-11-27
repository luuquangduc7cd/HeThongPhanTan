package support;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Caculation extends Remote {
	public abstract int add(int a, int b) throws RemoteException;
	public abstract int sub(int a, int b) throws RemoteException;
	public abstract int mul(int a, int b) throws RemoteException;
	public abstract double div(int a, int b) throws RemoteException;
}