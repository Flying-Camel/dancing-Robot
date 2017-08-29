package practice6;
import java.util.Scanner;

public class Ass3 {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		int[] array = new int[100];
		
		System.out.println("수를 입력하시오");
		int i;
		for(i=0;i<100;i++){
			array[i] = in.nextInt();
			if(array[i] == -999)
				break;
		}
		if(duplicate(array))
			System.out.println("중복된게 있습니다");
		else
			System.out.println("중복된 수가 없습니다");
		
	}
	public static boolean duplicate(int[] arr){
	
		int i,j;
		for(i=0;i<100;i++){
			if(arr[i]==0)
				return false;
			for(j=i+1;j<100;j++){
				if(arr[j]==0)
					break;
				if(arr[i]==arr[j])
					return true;
			}
		}
		return false;
	}
}
