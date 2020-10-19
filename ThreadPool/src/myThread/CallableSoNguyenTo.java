package myThread;

import java.util.concurrent.Callable;

public class CallableSoNguyenTo implements Callable<String> {
	private int n;
	private String name;
	
	public CallableSoNguyenTo(int n, String name) {
		this.n = n;
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		String str = "";
		if(Math.abs(n) < 2) {
			str = String.format("%s - %d không là số nguyên tố",name, n);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {}
			return str;
		}
		else {
			for(int i = 2; i <= Math.sqrt(n); i++) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {}
				if(n % i == 0) {
					str = String.format("%s - %d không là số nguyên tố", name, n);
					return str;
				}
			}
			str = String.format("%s - %d là số nguyên tố", name, n);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {}
			return str;
		}
	}
	

}
