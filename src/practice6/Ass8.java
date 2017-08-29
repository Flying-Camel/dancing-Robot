package practice6;


public class Ass8{
	private int[] score=new int[20];
	
	public Ass8(int[] score){
		this.score=score;
	}
	public double getAverage(){
		int sum=0;
		double average;
		for(int i=0;i<score.length;i++)	{
			sum+=score[i];
		}
		average=sum/score.length;
		return average;
	}
}
