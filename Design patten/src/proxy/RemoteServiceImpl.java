package design.pattern.proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteServiceImpl extends UnicastRemoteObject implements RemoteService {

	private static final long serialVersionUID = 5038336122381340240L;
	
	protected RemoteServiceImpl() throws RemoteException {
		super();
	}

	@Override
	public String sayHello() {
		
		return "Hello udara from remote.";
	}
	
	public static void main(String[] args) {
		
		try {
			RemoteService service = new RemoteServiceImpl();
			Naming.rebind("RemoteHello", (Remote) service);
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
