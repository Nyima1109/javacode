package test;

public class Exception {
	void divide(int num) {
		try {
			int res=1000/num;
			System.out.println("Result:"+res);
		}
		catch (Exception e) {
			System.out.println("Please give valid input");
		}
	}
	public static void main(String args[]) {
		Exception obj=new Exception();
		obj.divide(0);
	}
}
