package Tasca1.n2;

public class Agenda {
	
	private Address address;
	private Phone phone;
	
	public Agenda(AbstractFactory factory, String address, String phone) {
		this.address = factory.createAddress(address);
		this.phone = factory.createPhone(phone);
	}
	
	public String toString() {
		return ("Entrada de agenda:"
				+ "\n adreça: " + address.getAddress()
				+ "\n numero telefon: " + phone.getNumber());
	}

}
