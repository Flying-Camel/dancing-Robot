package practice12;

public class Thread1 extends Thread {
	private int delay;
	
	public Thread1(int delay){
		this.delay = delay;
	}
	
	public void run() {

		for (int i = 0; i < 2; i++) {
			try {
				Thread1.sleep(delay);
				System.out.println("Hello world"+delay);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}