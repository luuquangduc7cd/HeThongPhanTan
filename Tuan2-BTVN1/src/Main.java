import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[20];
		ListThread list = new ListThread();
		Random rd = new Random();
		System.out.print("Array: ");
		for(int i = 0; i < 20; i++) {
			arr[i] = Math.abs(2 + rd.nextInt() % 999);
			System.out.print(arr[i] + ", ");
		}
		list.addRange(arr);
		System.out.println();
		list.startAll();
	}

}
