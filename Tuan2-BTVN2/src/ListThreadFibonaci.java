import java.util.ArrayList;

public class ListThreadFibonaci {
	private ArrayList<ThreadFibonaci> list;
	public ListThreadFibonaci() {
		this.list = new ArrayList();
	}
	public void addNewItem(ThreadFibonaci t) {
		list.add(t);
	}
	public void addRange(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			ThreadFibonaci t = new ThreadFibonaci(arr[i]);
			list.add(t);
		}
	}
	public void startAll() {
		for (ThreadFibonaci i : list) {
			i.start();
		}
	}
}
