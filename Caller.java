package test;

public class Caller {
		public static void main(String args[]) {
			Bank obj=new GblBank();
			obj.deposit(10000);
			obj.withdraw(1000);
			obj.showBalance();
		}

}
