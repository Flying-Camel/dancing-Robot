package practice6;

import java.util.Scanner;


public class Ass6Test{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args)
	{
		int snum;
		int[] num = new int[100];

		System.out.println("���� �Է��Ͻÿ�");
		int i;
		for(i=0;i<100;i++){
			num[i] = in.nextInt();
			if(num[i] == -999)
				break;
		}
		
		Ass6 nm=new Ass6(num);
		snum=nm.findSecond();
		
		System.out.println("�ι�°�� ū �� :"+snum);
		
	}

}
