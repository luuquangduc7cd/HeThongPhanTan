package myThread;

public class ThreadSoNguyenTo implements Runnable {
	private int n;
	private String name;
	public ThreadSoNguyenTo(int n, String name) {
		this.n = Math.abs(n);
		this.name = name;
	}
	@Override
	public void run() {
		String str = "";
		if(Math.abs(n) < 2) {
			str = String.format("%s - %d không là số nguyên tố",name, n);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {}
			System.out.println(str);
			return;
		}
		else {
			for(int i = 2; i <= Math.sqrt(n); i++) {
				if(n % i == 0) {
					str = String.format("%s - %d không là số nguyên tố", name, n);
					System.out.println(str);
					return;
				}
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {}
			}
			str = String.format("%s - %d là số nguyên tố", name, n);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {}
			System.out.println(str);
		}
	}
}
