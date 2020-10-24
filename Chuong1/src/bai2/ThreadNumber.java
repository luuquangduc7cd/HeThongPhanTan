package bai2;

public class ThreadNumber extends Thread {
	public ThreadNumber(String name) {
		this.setName(name);
	}
	@Override
	public void run() {
		for(int i = 0; i < 26; i++) {
			System.out.print(i + " ");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
