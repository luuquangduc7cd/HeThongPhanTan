
public class ThreadPhuongTrinhBacHai extends Thread {
	private int a = 0, b = 0, c = 0;
	
	public ThreadPhuongTrinhBacHai(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String result = timNghiem();
		System.out.println(result);
	}
	
	private String timNghiem() {
		String temp = String.format("Phương trình %dx^2 + %dx + %d = 0", this.a, this.b, this.c);
		String result = "";
		if(this.a == 0) {
			if(b == 0 & c == 0)
				result = String.format("%s %s", temp, "có vô số nghiệm");
			else if(b == 0 && c != 0)
				result = String.format("%s %s", temp, "vô nghiệm");
			else
				result = String.format("%s %s", temp, "có nghiệm là " + (-1.0*c)/b);
		}
		else {
			double delta = 1.0*(Math.pow(b, 2) - 4*a*c);
			if(delta < 0)
				result = String.format("%s %s", temp, "vô nghiệm");
			else if(delta == 0)
				result = String.format("%s %s", temp, "có nghiệm kép: " + (-b - Math.sqrt(delta)) / (2 * a));
			else {
				result = String.format("%s %s", temp, "có hai nghiệm phân biệt: ");
				result += "\nx1 = " + (-b - Math.sqrt(delta))/(2*a);
				result += "\nx1 = " + (-b + Math.sqrt(delta))/(2*a);
			}
		}
		return result;
	}
}
