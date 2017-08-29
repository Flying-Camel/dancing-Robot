package practice11;

public class Ass6 {

	public static void main(String[] args) {

		DataSet2 d = new DataSet2();
		d.setminmax("100", "nickel");
		d.setminmax("234", "penny");
		d.setminmax("567", "penny");
		d.setminmax("121", "nickel");
		d.setminmax("113", "nickel");
		
		System.out.println("maximum : " + d.getMaximum() + "    minimum :"
				+ d.getminimum());

	}
}
