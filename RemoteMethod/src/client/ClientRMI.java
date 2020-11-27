package client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.security.Security;
import java.util.Scanner;

import server.ServerRMI;

public class ClientRMI {
	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		ServerRMI client = (ServerRMI) Naming.lookup("rmi://localhost:4444/calc");
		Scanner scn = new Scanner(System.in); 
		System.out.print("Nhap a = ");
		int a = scn.nextInt();
		int b = scn.nextInt();
		System.out.println(String.format("%d + %d = %d",a,b, client.add(a, b)));
		System.out.println(String.format("%d - %d = %d",a,b, client.sub(a, b)));
		System.out.println(String.format("%d * %d = %d",a,b, client.mul(a, b)));
		System.out.println(String.format("%d / %d = %.2f",a,b, client.div(a, b)));
	}
}
