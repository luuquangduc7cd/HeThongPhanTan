package bai3;

public class OutputString extends Thread {
	private ThreadString ts;
	private String s;
	public OutputString(ThreadString ts, String str) {
		this.ts = ts;
		s = str;
	}
	
	@Override
	public void run() {
		ts.display(s);
	}
}
