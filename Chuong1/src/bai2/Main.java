package bai2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadLetter tl = new ThreadLetter("Letter");
		ThreadNumber tn = new ThreadNumber("Number");
		tl.start();
		tn.start();
	}

}
