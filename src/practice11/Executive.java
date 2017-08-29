package practice11;

public class Executive extends Manager {

	public Executive(String name, int salary, String dep) {
		super(name, salary, dep);
	}
	public String toString(){
		return "name : "+this.getName()+"\nsalary : "+this.getSalary()+"\ndepartment : "+this.getDep();
	}
}
