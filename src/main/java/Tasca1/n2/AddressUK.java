package Tasca1.n2;

public class AddressUK implements Address {
	
	private String address;
	
	public AddressUK(String address) {
		this.address = address + ", United Kingdom";
	}
	
	@Override
	public String getAddress() {
		return address;
	}

}
