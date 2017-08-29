package practice9;

public class Ass1Test{
	static public void main(String[] args){
		DataSet quiz = new DataSet();
		quiz.add(new Ass1(9,"A"));
		quiz.add(new Ass1(10,"A"));
		quiz.add(new Ass1(5,"B"));
		quiz.add(new Ass1(3,"C"));
		quiz.add(new Ass1(1,"F"));
		
		System.out.println("Average(Score) : "+quiz.getAverage());
		
		if(quiz.getAverage()<2)
			System.out.println("Average(grade) : "+"F");
		if(quiz.getAverage()>1&&quiz.getAverage()<5)
			System.out.println("Average(grade) : "+"C");
		if(quiz.getAverage()>4&&quiz.getAverage()<8)
			System.out.println("Average(grade) : "+"B");
		if(quiz.getAverage()>7)
			System.out.println("Average(grade) : "+"A");
	
		Measurable max = quiz.getMaximum();
		System.out.println("Highest : "+max.getMeasure());

	}
}