package design.pattern.adapter;

public class PersonImpl implements IPerson{

	@Override
	public String getFirstName() {
		return "Nimal";
	}

	@Override
	public String getLastName() {
		return "Senevirathne";
	}

	@Override
	public String getAddressLine1() {
		return "No:117/1, Kandy Road,";
	}

	@Override
	public String getAddressLine2() {
		return "Mudungoda";
	}
}
