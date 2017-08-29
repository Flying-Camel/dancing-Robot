package practice12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ass5 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner console = new Scanner(System.in);
		System.out.println("typing input file name : ");
		String inputFileName = console.next();
		File inputFile = new File(inputFileName);
		Scanner in = new Scanner(inputFile);		
		
		System.out.println("typing output file name : ");
		String outputFileName = console.next();
		PrintWriter out = new PrintWriter(outputFileName);
		
		int total=0;
		
		while(in.hasNext()){
			String str = in.next();
			total += str.length();
		}
		out.print("number of character : "+total);
		
		in.close();
		out.close();
		
		System.out.println("Complete!");
	}

}
