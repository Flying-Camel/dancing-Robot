package practice6;

import java.util.Scanner;

public class Ass7Test {
	static Scanner in = new Scanner(System.in);
	static Scanner in2 = new Scanner(System.in);

	public static void main(String[] args) {
		String instructor;
		String cls;
		String addstu;
		double addsco;
		int num;

		double[] score = new double[5];
		String[] name = new String[5];

		System.out.println("instructor 를 입력하세요");
		instructor = in.nextLine();

		System.out.println("Class 를 입력하세요");
		cls = in.nextLine();

		Ass7 s1 = new Ass7(instructor, cls);
		int kk=0;
		while (kk==0) {
			System.out.println("하고싶은 것을 입력하세요");
			System.out.println("1.addstudent   2.remove student   3.Quite");
			num = in.nextInt();
			switch (num) {
			case 1:
				System.out.println("AddStudent : 몇명을 추가하시겠습니까?");
				int ad;
				ad = in.nextInt();
				addstu = in.nextLine();
				for (int i = 0; i < ad; i++) {
					System.out.println("이름을 쓰세요");

					addstu = in.nextLine();
					System.out.println("점수를 입력하세요");
					addsco = in2.nextDouble();

					s1.addStu(addstu, addsco);
				}
				break;
			case 2:
				System.out.println("Remove   제거하고자하는 학생의 넘버를 쓰세요");
				int i = in.nextInt();
				s1.removeStu(i - 1);
				break;
			case 3:
				return;
			}
			System.out.println("Students GPA : " + s1.getAverage());
			s1.printRoster();
		}
	}
}
