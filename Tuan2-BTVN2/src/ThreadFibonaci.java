
public class ThreadFibonaci extends Thread {
	private int n;
	
	public ThreadFibonaci(int n) {
		this.n = Math.abs(n);
		this.setName("Thread-" + n);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int result = 0;
		for(int i = 0; i < this.n; i++)
			result += this.fibonaciValue(i);
		System.out.println(this.getName() + ": " +result);
	}
	
	private int fibonaciValue(int level) {
		if(level < 1)
			return 0;
		if(level == 1 || n == 2)
			return 1;
		return fibonaciValue(level - 1) + fibonaciValue(level - 2);
	}
}
