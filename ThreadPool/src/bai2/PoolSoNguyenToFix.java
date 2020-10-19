package bai2;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import myThread.ThreadSoNguyenTo;

public class PoolSoNguyenToFix {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(5);
		System.out.println("Bai 2");
		Random rd = new Random();
		for(int i = 0; i < 20; i++) {
			int randonInt = rd.nextInt();
			ThreadSoNguyenTo t = new ThreadSoNguyenTo(randonInt, "Thread " + i);
			es.execute(t);
		}
		es.shutdown();
	}

}
