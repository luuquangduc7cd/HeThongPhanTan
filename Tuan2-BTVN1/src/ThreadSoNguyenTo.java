public class ThreadSoNguyenTo extends Thread {
	private int input;
	public ThreadSoNguyenTo(int input) {
		this.input = input;
	}
	@Override
	public void run() {
		String result = "";
		if(kiemTraNguyenTo())
			result = String.format("%s: %d la so nguyen to", this.getName(), input);
		else
			result = String.format("%s: %d khoong la so nguyen to", this.getName(), input);
		System.out.println(result);
	}
	private boolean kiemTraNguyenTo() {
		for(int i = 2; i <= input/2; i++)
			if(input % 2 == 0)
				return false;
		return true;
	}
}