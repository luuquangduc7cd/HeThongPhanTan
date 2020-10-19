package bai5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import myThread.CallableSoNguyenTo;

public class PoolCoThuTu {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService es = Executors.newCachedThreadPool();
		List<Future<String>> listFuture = new ArrayList<Future<String>>();
		Random rd = new Random();
		for(int i = 0; i < 20; i++) {
			int randonInt = rd.nextInt();
			CallableSoNguyenTo t = new CallableSoNguyenTo(randonInt, "Callable " + i);
			Future<String> future = es.submit(t);
			listFuture.add(future);
		}
		for (Future<String> future : listFuture) {
			try {
				System.out.println(future.get());
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}
		es.shutdown();
	}

}
