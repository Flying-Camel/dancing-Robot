package practice12;

public class Ass3 {
	public static void main(String[] args) {

		PrintNameThread p1 = new PrintNameThread("Kim");
		Thread2 t1 = new Thread2(p1);
		t1.start();
		
		PrintNameThread p2 = new PrintNameThread("Lee");
		Thread2 t2 = new Thread2(p2);
		t2.start();

		PrintNameThread p3 = new PrintNameThread("Park");
		Thread2 t3 = new Thread2(p3);
		t3.start();

		
	}

}
