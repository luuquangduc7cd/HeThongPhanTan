import java.util.ArrayList;

public class ListThreadDaySo {
	private ArrayList<ThreadDaySo> list;
	public ListThreadDaySo() {
		this.list = new ArrayList();
	}
	public void addNewItem(ThreadDaySo t) {
		list.add(t);
	}
	public void startAll() {
		for (ThreadDaySo i : list) {
			i.start();
		}
	}
}
