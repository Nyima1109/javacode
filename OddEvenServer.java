package lab6;
import java.rmi.registry.*;

public class OddEvenServer {
	public static void main(String[]args) {
		try {
			OddEvenRemoteImpl obj= new OddEvenRemoteImpl();
			Registry reg=LocateRegistry.createRegistry(1099);
			reg.rebind("oddeven",obj);
			System.out.println("Odd-Even RMI Server is running...");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
