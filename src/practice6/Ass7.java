package practice6;

import java.util.Arrays;
import java.util.Scanner;

public class Ass7 {

	private String instructor;
	private String cls;
	private double[] score = new double[5];
	private String[] name = new String[5];
	private int num = 0;

	public Ass7(String instructor, String cls) {
		this.instructor = instructor;
		this.cls = cls;
	}

	public void addStu(String stu, double sco) {

		name[num] = stu;
		score[num] = sco;
		num++;
		if (num == name.length) {

			name = Arrays.copyOf(name, 2 * name.length);

			score = Arrays.copyOf(score, 2 * score.length);
		}
	}

	public void removeStu(int rem) {
		while (rem < num) {

			name[rem] = name[rem + 1];
			score[rem] = score[rem + 1];
			rem++;
		}
		num--;
	}

	public double getAverage() {
		double sum = 0.0;
		for (int i = 0; i < num; i++)
			sum += score[i];
		return sum / num;
	}

	public void printRoster() {
		for (int i = 0; i < num; i++)
			System.out.println("학생이름 :" + name[i] + " 학생점수 :"
					+ score[i]);
	}

}
