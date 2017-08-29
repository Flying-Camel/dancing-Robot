package practice9;

public class Ass3 implements Sequence {
	private int num;

	public Ass3(int num) {
		this.num = num;
	}

	@Override
	public int nextPrime(){
		int nextPrime = num+1;
		boolean prime = false;
		int count = 1;
		int isPrime=0;

		while (!prime) {
		//	System.out.println(nextPrime+"asdf");
			while (count != nextPrime)
				if (nextPrime % count == 0){
					isPrime++;
					count ++;
				}
				else count ++;
			
			if (isPrime != 1) {
				count = 1;
				nextPrime++;
				isPrime=0;
			} else if (isPrime == 1)
				prime = true;
		}


		return nextPrime;
	}

}
