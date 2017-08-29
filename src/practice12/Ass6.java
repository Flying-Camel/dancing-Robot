package practice12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ass6 {
	static public void main(String[] args) throws FileNotFoundException {

		File inputFile = new File("babynames.txt");
		Scanner in = new Scanner(inputFile);

		PrintWriter out1 = new PrintWriter("boynames.txt");
		PrintWriter out2 = new PrintWriter("girlnames.txt");

		int count = 0;
		int num = 1;
		while (in.hasNext()) {

			if(count<4){
				out1.print(in.next()+" ");
				if(count==3)
					out1.println("");
				count++;
			}
			else if(count>3){
				if(count==4){
					out2.print(num+" ");
					num++;
				}
				out2.print(in.next()+" ");

				count++;
				if(count==7){
					out2.println("");
					count=0;
				}
			}
		}
	
			
		
		in.close();
		out1.close();
		out2.close();

	}
}
