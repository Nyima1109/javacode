package lab6;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
public class OddEvenRemoteImpl extends UnicastRemoteObject implements OddEvenRemote{
public OddEvenRemoteImpl() throws RemoteException{
	super();
}
@Override
public String checkOddEven(int num) throws RemoteException {
	if (num%2==0)
		return "Even Number";
	else
	return "Odd Number";
}

}