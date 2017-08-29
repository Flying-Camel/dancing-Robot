package practice9;

public class Ass1 implements Measurable {
	double score;
	String grade;

	public Ass1(double score, String grade) {
		this.score = score;
		this.grade = grade;
	}

	@Override
	public double getMeasure() {

		return score;
	}
}