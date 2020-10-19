package bai3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import myThread.CallableSoNguyenTo;

public class PoolStop {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService es = Executors.newCachedThreadPool();
		List<CallableSoNguyenTo> list = new ArrayList<CallableSoNguyenTo>();
		Random rd = new Random();
		
		for(int i = 0; i < 20; i++) {
			int random = 1 + rd.nextInt() % 999;
			CallableSoNguyenTo t = new CallableSoNguyenTo(random, "Callable " + i);
			list.add(t);
		}
		
		try {
			String result = es.invokeAny(list);
			System.out.println(result);
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		es.shutdown();
	}

}
