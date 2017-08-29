package practice6;

import java.util.Random;

public class Ass4 {
	public static void main(String[] args) {
		Random ran = new Random();
		String coin = "";
		int[] lengthArray = new int[100];
		int length=0;
		
		int j=0;
		for (int i = 0; i < 100; i++) {
			if (ran.nextInt(2) == 1){
				coin += "H";
				length++;
			}
			else{
				coin += "T";
				if(length!=0){
				lengthArray[j]=length;
				j++;
				length=0;
				}
			}
		}		
		System.out.println("Length\tNumber of runs of heads");
		int longs=0;
		for(int i=0;i<100;i++){
			if(longs<lengthArray[i])
				longs = lengthArray[i];
			
		}
		int count=0;
		for(int i=1;i<longs+1;i++){
			for(j=0;j<100;j++){
				if(i==lengthArray[j])
					count++;
			}
			System.out.println(i+"\t"+count);
			count=0;
		}
		
		
	}
}
