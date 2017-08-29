package practice12;

public class BankAccount {
	private int money=0;
	
	public BankAccount(int money)  {
		if(money<0)
			throw new IllegalArgumentException("You can't deposit negative");
		this.money = money;
	}
	
	public void deposit (int deposit){
		if(deposit < 0)
			throw new IllegalArgumentException("You deposit Negative");
		money+=deposit;
	}
	public void withdraw(int withdraw){
		if(money-withdraw < 0)
			throw new IllegalArgumentException("You withdraw too much money");
		if(withdraw < 0)
			throw new IllegalArgumentException("You can't withdraw negative");
		
		money-=withdraw;
	}
	public int getBalance(){
		return money;
	}
}
