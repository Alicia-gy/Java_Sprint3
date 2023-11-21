package Tasca1.n2;

public class FactoryUK implements AbstractFactory {
	
	@Override
	public Address createAddress(String address) {
		return new AddressUK(address);
	}
	
	@Override
	public Phone createPhone(String phone) {
		return new PhoneUK(phone);
	}

}
