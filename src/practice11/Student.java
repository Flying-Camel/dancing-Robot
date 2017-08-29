package practice11;

public class Student extends MyPerson {
	private String major;
	public Student(String name, String birthDay,String major) {
		super(name, birthDay);
		this.major = major;
	}
	public String getMajor(){
		return major;
	}
	public String toString(){
		
		return "name : "+this.getName()+"  birth Day : "+this.getBirthDay()+"  major : "+major;
	}
}
