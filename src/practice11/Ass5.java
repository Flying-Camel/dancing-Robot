package practice11;

public class Ass5 {

	static public void main(String[] args) {
		DataSet d = new DataSet();

		d.setminmax("123");
		d.setminmax("234");
		d.setminmax("567");
		d.setminmax("121");
		d.setminmax("234");
		d.setminmax("569");
		d.setminmax("111");
		System.out.println("maximum : " + d.getMaximum() + "    minimum :"
				+ d.getminimum());

	}
}
