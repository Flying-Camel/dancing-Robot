package practice11;

public class Instructer extends MyPerson {
	int salary;

	public Instructer(String name, String birthDay, int salary) {
		super(name, birthDay);
		this.salary = salary;
	}

	public int getSalary() {
		return this.salary;
	}

	public String toString() {

		return "name : " + this.getName() + "  birth Day : " + this.getBirthDay()
				+ "  salary : " + salary;
	}
}