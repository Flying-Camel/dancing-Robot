package practice11;
		
public class Ass4 {
	public static void main(String[] args){
		Employee e1 = new Employee("Juneun",1000000);
		Manager m1 = new Manager("zzang",100,"Soong Sil");
		Executive x1 = new Executive("babo",1,"heaven");
		
		System.out.println(e1.toString());
		System.out.println(m1.toString());
		System.out.println(x1.toString());
		
	}	
}			