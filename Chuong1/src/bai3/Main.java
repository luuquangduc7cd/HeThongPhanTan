package bai3;

public class Main {

	public static void main(String[] args) {
		ThreadString ts = new ThreadString();
		
		new OutputString(ts, "Luu Quang Duc").start();
		new OutputString(ts, "1601991").start();
		new OutputString(ts, "DHCNTT12A").start();
	}

}
