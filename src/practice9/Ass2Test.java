package practice9;

public class Ass2Test {
	public static void main(String[] args) {
		DataSet tall = new DataSet();
		tall.add(new Ass2(180,"Juneun"));
		tall.add(new Ass2(160,"Babo"));
		tall.add(new Ass2(170,"ChunJae"));
		
		System.out.println("Average height : "+tall.getAverage());
		Measurable max = tall.getMaximum();
		Ass2 person = (Ass2)max;
		System.out.println("talleast man : "+person.getName());
	}
}
