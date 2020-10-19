package bai1;

import java.util.Random;
import myThread.ThreadSoNguyenTo;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PoolSoNguyenTo {

	public static void main(String[] args) {
		ExecutorService es = Executors.newCachedThreadPool();
		Random rd = new Random();
		for(int i = 0; i < 20; i++) {
			int randonInt = rd.nextInt();
			ThreadSoNguyenTo t = new ThreadSoNguyenTo(randonInt, "Thread " + i);
			es.execute(t);
		}
		es.shutdown();
	}

}
