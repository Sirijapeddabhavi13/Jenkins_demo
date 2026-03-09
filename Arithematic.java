// Create an interface with Abstract method.
import java.rmi.Remote;

public interface Arithematic Extends Remote
{
	public int add(int a,int b)throws RemoteException;
}
