package Tasca1.n2;

public class AddressES implements Address {
	
	private String address;
	
	public AddressES(String address) {
		this.address = address + ", Spain";
	}
	
	@Override
	public String getAddress() {
		return address;
	}

}
