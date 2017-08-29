package practice12;

public class Ass2 {
	static public void main(String[] args){
		Thread1 t1 = new Thread1(1);
		Thread1 t2 = new Thread1(2);
		Thread1 t3 = new Thread1(3);
		Thread1 t4 = new Thread1(4);
		Thread1 t5 = new Thread1(5);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

	}
}
