package Tasca1.n2;

public class FactoryES implements AbstractFactory {
	
	@Override
	public Address createAddress(String address) {
		return new AddressES(address);
	}
	
	@Override
	public Phone createPhone(String phone) {
		return new PhoneES(phone);
	}

}
