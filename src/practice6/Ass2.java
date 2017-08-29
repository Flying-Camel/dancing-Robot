package practice6;
import java.util.Scanner;

public class Ass2 {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] mat = new int[3][3];
		System.out.println("9개의 수를 입력");
		int i, j;
		for (i = 0; i < 3; i++)
			for (j = 0; j < 3; j++)
				mat[i][j] = in.nextInt();

		System.out.println("Origianl");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println("");
		}

		int[][] tmat = new int[3][3];
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				if(i==j)
					tmat[i][j] = mat[i][j];
				else
					tmat[i][j] = mat[j][i];
			}
		}

		System.out.println("TransPosed");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(tmat[i][j] + " ");
			}
			System.out.println("");
		}		
		
		
		
		
		
	}
}
