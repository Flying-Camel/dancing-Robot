package practice11;

public class DataSet {
	private double sum;
	private Comparable maximum;
	private Comparable minimum;
	private int count;

	public DataSet() {
		sum = 0;
		count = 0;
		maximum = null;
	}

	public void setminmax(Comparable x) {
		if (count == 0) {
			maximum = x;
			minimum = x;
		} else {
			if (x.compareTo(minimum) < 0)
				minimum = x;
			if (x.compareTo(maximum) > 0)
				maximum = x;
		}

		count++;
	}


	public double getAverage() {
		if (count == 0)
			return 0;
		else
			return sum / count;
	}

	public Comparable getMaximum() {
		return maximum;
	}

	public Comparable getminimum() {
		return minimum;
	}
}
