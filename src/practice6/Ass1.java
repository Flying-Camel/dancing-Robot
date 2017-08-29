package practice6;

import java.util.Scanner;

public class Ass1 {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		String[] str = new String[10];
		System.out.println("10가지 수 입력");
		int i, j;

		int num;
		for (i = 0; i < 10; i++) {
			num = in.nextInt();
			for (j = 0; j < 10; j++) {
				if ((1 + (j * 10) < num && num < (j + 1) * 10)) {
					if (str[j] == null)
						str[j] = "*";
					else
						str[j] = str[j] + "*";
				}
			}
		}

		for (i = 0; i < 10; i++) {
			System.out.print(1 + (i * 10));
			System.out.print("\t- " + ((i + 1) * 10));
			System.out.print("\t|   ");
			if (str[i] == null)
				System.out.println("");
			else
				System.out.println(str[i]);
		}

	}
}
