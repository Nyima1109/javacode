package lab6;
import java.rmi.registry.*;
import java.util.Scanner;
public class OddEvenClient {
public static void main(String []args) {
	try {
		Registry reg=LocateRegistry.getRegistry(1099);
		OddEvenRemote obj= (OddEvenRemote) reg.lookup("oddeven");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a  number:");
		int n = sc.nextInt();
		String result = obj.checkOddEven(n);
		System.out.println("Result from server:"+result);
	} catch(Exception e) {
		e.printStackTrace();
	}
}
}
