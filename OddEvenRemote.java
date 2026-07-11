package lab6;
import java.rmi.Remote;
import java.rmi.RemoteException;
public interface OddEvenRemote extends Remote{
String checkOddEven(int num) throws RemoteException;
}
