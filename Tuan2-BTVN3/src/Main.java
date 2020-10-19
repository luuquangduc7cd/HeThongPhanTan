import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListPhuongTrinhBacHai list = new ListPhuongTrinhBacHai();
		Random rd = new Random();
		for(int i = 0; i < 20; i++)
			for(int j = 0; j < 3; j++) {
				int a = Math.abs(rd.nextInt()) % 101;
				int b = Math.abs(rd.nextInt()) % 101;
				int c = Math.abs(rd.nextInt()) % 101;
				ThreadPhuongTrinhBacHai t = new ThreadPhuongTrinhBacHai(a, b, c);
				list.addNewItem(t);
			}
		list.startAll();
	}

}
