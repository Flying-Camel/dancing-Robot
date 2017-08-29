package practice11;

public class Employee {
	private String name;
	private int salary;
	
	public Employee(String name,int salary){
		this.name = name;
		this.salary = salary;		
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}
	public String toString(){
		return "name : "+this.getName()+"\nsalary : "+this.getSalary();
	}
}
