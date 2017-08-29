package practice11;

public class DataSet2 {
	private double sum;
	int nickel;
	private Comparable maximum;
	private Comparable minimum;
	private int count;
	private String name;
	private String Mname;
	private String mname;
	private String qname;
	String qt;
	String qn;

	public DataSet2() {
		sum = 0;
		count = 0;
		maximum = null;
	}

	public void setminmax(Comparable x, String k) {
		Comparable t;

		if (count == 0) {
			if (k.equals("nickel")) {
				nickel = Integer.parseInt((String) x);
				nickel = nickel * 5;
				t = Integer.toString(nickel);
				qt = (Integer.toString(nickel));
				qn = (Integer.toString(nickel));
			} else {
				qt = (String) x;
				qn = (String) x;
				t = x;
			}
			Mname = k;
			mname = k;
			maximum = x;
			minimum = x;

		} else {
			t = x;
			if (k.equals("nickel")) {
				nickel = Integer.parseInt((String) x);
				nickel = nickel * 5;
				t = (Integer.toString(nickel));
				if (t.compareTo(maximum) > 0) {

				}
			}

			if (t.compareTo(qt) < 0) {
				if (k.equals("nickel"))
					qt = (Integer.toString(nickel));
				minimum = x;
				mname = k;
			}
			if (t.compareTo(qn) > 0) {
				if (k.equals("nickel"))
					qn = (Integer.toString(nickel));
				maximum = x;

				Mname = k;
			}
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
		return maximum + " " + Mname;
	}

	public Comparable getminimum() {
		return minimum + " " + mname;
	}
}