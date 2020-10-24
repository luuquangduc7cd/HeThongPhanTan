package bai1;

public class ThreadCount extends Thread {
	
	public ThreadCount(String name) {
		this.setName(name);
	}
	@Override
	public void run() {
		System.out.println(String.format("%s: start!", getName()));
		for(int i = 1; i < 6; i++) {
			System.out.println(String.format("%s: %d", getName(), i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(String.format("%s: end!", getName()));
	}
}
