package bai2;

public class ThreadLetter extends Thread {
	public ThreadLetter(String name) {
		this.setName(name);
	}
	@Override
	public void run() {
		for(int i = 0; i < 26; i++) {
			char c = (char) (i + 65);
			System.out.print(c + " ");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
