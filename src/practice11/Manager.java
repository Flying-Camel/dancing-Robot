package practice11;

public class Manager extends Employee {
	private String dep;
	public Manager(String name, int salary,String dep) {
		super(name, salary);
		this.dep = dep;		
	}
	public String getDep(){
		return dep;
	}
	public String toString(){
		return "name : "+this.getName()+"\nsalary : "+this.getSalary()+"\ndepartment : "+this.getDep();
	}
}
