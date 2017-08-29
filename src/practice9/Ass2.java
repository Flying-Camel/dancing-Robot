package practice9;

public class Ass2 implements Measurable {
	String name;
	double height;
	String tallMan;
	
	public Ass2(){
		this.height = 0;
		this.name = "";
	}
	public Ass2(double height,String name){
		this.height = height;
		this.name = name;
	}
	@Override
	public double getMeasure() {
		return height;
	}
	
	public String getName(){
		
		
		return name;
	}
}