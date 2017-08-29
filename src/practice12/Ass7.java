package practice12;

public class Ass7 {
	static public void main(String[] args){
		try{
			BankAccount a1 = new BankAccount(-2);
		}
		catch(IllegalArgumentException a1){
			System.out.println("one check");
		}
		
	//	BankAccount a1 = new BankAccount(-2);
		
		BankAccount a2 = new BankAccount(10);
		try{
			a2.deposit(-5);

		}
		catch(IllegalArgumentException e){
			System.out.println("two check");
		}
		
		try{
			a2.withdraw(-12);
		}
		catch(IllegalArgumentException e){
			System.out.println("three check");
		}
		
		System.out.println(a2.getBalance());
	}
	
}
