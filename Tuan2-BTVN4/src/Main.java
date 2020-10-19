import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListThreadDaySo list = new ListThreadDaySo();
		Random rd = new Random();
		
		list.addNewItem(new ThreadDaySo(5, 5, 5, 5, 5));
		list.addNewItem(new ThreadDaySo(1, 2, 3, 4, 5));
		list.addNewItem(new ThreadDaySo(5, 4, 3, 2, 1));
		
		for(int i = 0; i < 17; i++) {
			int n1 = Math.abs(rd.nextInt()) % 101;
			int n2 = Math.abs(rd.nextInt()) % 101;
			int n3 = Math.abs(rd.nextInt()) % 101;
			int n4 = Math.abs(rd.nextInt()) % 101;
			int n5 = Math.abs(rd.nextInt()) % 101;
			ThreadDaySo t = new ThreadDaySo(n1, n2, n3, n4, n5);
			list.addNewItem(t);
		}
		list.startAll();
	}

}
