package practice12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ass4 {
	static public void main(String[] args) throws FileNotFoundException {
		Scanner console = new Scanner(System.in);
		System.out.println("typing file name : ");
		String outputFileName = console.nextLine();
		
		PrintWriter out = new PrintWriter(outputFileName);
		out.println("Hello, My first program in File");
		out.close();
	}
}