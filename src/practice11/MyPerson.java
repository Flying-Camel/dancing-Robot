package practice11;

public class MyPerson {
	private String name;
	private String birthDay;
	public MyPerson(String name,String birthDay){
		this.name = name;
		this.birthDay = birthDay;
	}
	public String getName(){
		return this.name;
	}
	public String getBirthDay(){
		return this.birthDay;
	}
	public String toString(){
		
		return "name : "+name+"  birth Day : "+birthDay;
	}
}
