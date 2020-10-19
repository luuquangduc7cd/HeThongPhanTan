import java.util.ArrayList;

public class ListThread {
	private ArrayList<ThreadSoNguyenTo> list;
	public ListThread() {
		list = new ArrayList();
	}
	public void addNewItem(ThreadSoNguyenTo t) {
		list.add(t);
	}
	public void addRange(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			ThreadSoNguyenTo t = new ThreadSoNguyenTo(arr[i]);
			list.add(t);
		}
	}
	public void startAll() {
		for (ThreadSoNguyenTo i : list) {
			i.start();
		}
	}
}
