import java.util.ArrayList;

public class ListPhuongTrinhBacHai {
	private ArrayList<ThreadPhuongTrinhBacHai> list;
	public ListPhuongTrinhBacHai() {
		this.list = new ArrayList();
	}
	public void addNewItem(ThreadPhuongTrinhBacHai t) {
		list.add(t);
	}
	public void startAll() {
		for (ThreadPhuongTrinhBacHai i : list) {
			i.start();
		}
	}
}
