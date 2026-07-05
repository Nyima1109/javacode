package test;

public class GblBank implements Bank{
	int amt=0;
	public void deposit(int amt) 
	{
		this.amt +=amt;
	}
	public void withdraw(int amt) {
		this.amt-=amt;
	}
public void showBalance() {
	System.out.println("Balance:"+amt);
}
}

