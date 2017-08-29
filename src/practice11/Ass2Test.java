package practice11;

public class Ass2Test {
	static public void main(String[] args){
		Person p1=new Person("Smith","John", 21);
		Person p2=new Person("Smith","John", 22);
		Person p3=new Person("Smith","John", 21);

		System.out.println("p1.equals(p2) : "+p1.equals(p2));
		System.out.println("p1.equals(p3) : "+p1.equals(p3));		
		
	}

}
