package practice12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ass8 {
	private static Scanner in = new Scanner(System.in);

	private static int count = 0;
	private static int check = 0;
	private static int sum = 0;
	private static double num = 0;

	static public void main(String[] args) {

		while (check < 2) {

			try {
				num = in.nextDouble();
			} catch (InputMismatchException e2) {
				in.next();
				check++;
				if (check == 1)
					System.out.println("You have chance(1/2)");
			}
			sum += num;
			if (check == 2) {
				System.out.println("You enter wrong character!(2/2)");
				break;
			}
		}


		System.out.println("total : " + sum);
	}
}
