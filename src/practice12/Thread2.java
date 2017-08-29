package practice12;

public class Thread2 extends Thread {
	PrintNameThread p1;
	public Thread2(PrintNameThread p1){
		this.p1 = p1;
	}
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println(p1.getName());
		}
	}
}
