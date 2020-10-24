package bai4;

public class AnimationThread extends Thread {
	
	private int i = 0;
	private AnimationFrame af;
	
	public AnimationThread(AnimationFrame af) {
		this.af = af;
	}
	@Override
	public void run() {
		while(true) {
			i = (i + 1) % 2;
			af.repaint();
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public int getIndex() {
		return i;
	}
}
