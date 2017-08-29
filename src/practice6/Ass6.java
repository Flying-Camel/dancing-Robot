package practice6;

public class Ass6 {
	private int[] num = new int[10];

	public Ass6(int[] num){
		this.num = num;
	}

	public int findSecond(){
		int i, temp = 0, max = 0;

		for (i = 0; i < 100; i++){
			if (num[i] == -999)
				return temp;

			if (num[i] > max){
				temp = max;
				max = num[i];
			} 
			else if (num[i] >= temp){
				temp = num[i];
			}
		}
		return temp;
	}
}
