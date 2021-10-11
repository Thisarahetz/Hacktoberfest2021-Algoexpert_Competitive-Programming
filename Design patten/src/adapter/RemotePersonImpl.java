package design.pattern.adapter;

public class RemotePersonImpl implements IRemotePerson{

	@Override
	public String geenerateFullName() {
		System.out.println("Invoke remote geenerateFullName() method.");
		return null;
	}

	@Override
	public String generateFullAddress() {
		System.out.println("Invoke remote generateFullAddress() method.");
		return null;
	}

}
