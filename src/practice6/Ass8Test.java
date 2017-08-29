package practice6;
import java.util.Scanner;
public class Ass8Test
{
	public static void main(String[] args)
	{
		int[] score=new int[20];
		double average;
		Scanner in=new Scanner(System.in);
		for(int i=0;i<score.length;i++)
		{
			System.out.println("학생"+(i+1)+" 의 점수를 입력하세요");
			score[i]=in.nextInt();
		}
		Ass8 num=new Ass8(score);
		average=num.getAverage();
		System.out.println("학생들의 평균 :"+average);
		
	}

}
