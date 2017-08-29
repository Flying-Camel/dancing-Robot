package practice13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ass5 {
	
	static public void main(String[] args) throws FileNotFoundException{
		
		File input = new File("Input.txt");
		Scanner in = new Scanner(input);
		
		int i = 0;
		while(in.hasNextLine()){
			String str = in.nextLine();
			if(str.length()>80)
				try {
					throw new ExceptionLineTooLong("Too Long");
				} catch (ExceptionLineTooLong e) {
					e.printStackTrace();
				}
			
		}
		
		
	}


}
