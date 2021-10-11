package design.pattern.proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class MyRemoteClient {
	
	public static void main(String[] args) {
		
		new MyRemoteClient().go();
	}
	
	public void go(){
		
		try {
			RemoteServiceImpl service = (RemoteServiceImpl) Naming.lookup("rmi://localhost/RemoteHello");
			String ss = service.sayHello();
			System.out.println(ss);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
	}

}
