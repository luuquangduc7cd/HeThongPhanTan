
public class ThreadDaySo extends Thread {
	int[] arr = new int[5];
	public ThreadDaySo(int n1, int n2, int n3, int n4, int n5) {
		this.arr[0] = n1;
		this.arr[1] = n2;
		this.arr[2] = n3;
		this.arr[3] = n4;
		this.arr[4] = n5;
	}
	
	@Override
	public void run() {
		String temp = "[";
		temp += String.format("%d, %d, %d, %d, %d", arr[0], arr[1], arr[2], arr[3], arr[4]);
		temp += "]";
		if(tang() && giam())
			temp += ": la day cac so giong nhau!";
		else if (tang())
			temp += ": la day so tang!";
		else if(giam())
			temp += ": la day so giam!";
		else 
			temp += ": la mot day so binh thuong!";
		System.out.println(temp);
	}
	
	private boolean tang() {
		for(int i = 0; i < arr.length - 1; i++)
			if(arr[i] > arr[i + 1])
				return false;
		return true;
	}
	private boolean giam() {
		for(int i = 0; i < arr.length - 1; i++)
			if(arr[i] < arr[i + 1])
				return false;
		return true;
	}
}
