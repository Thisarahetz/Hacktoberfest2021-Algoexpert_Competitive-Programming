package design.pattern.adapter;

public class PersonAdapter implements IRemotePerson{
	
	IPerson person;
	
	public PersonAdapter(IPerson person) {
		
		this.person = person;
	}

	@Override
	public String geenerateFullName() {
		String name = person.getFirstName() + " " + person.getLastName();
		for (int i = 0; i < 4; i++) {
			System.out.println(name);
		}
		return name;
	}

	@Override
	public String generateFullAddress() {
		String address = person.getAddressLine1() + " " + person.getAddressLine2();
		for (int i = 0; i < 4; i++) {
			System.out.println(address);
		}
		return address;
	}

}
