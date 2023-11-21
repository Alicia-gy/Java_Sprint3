package Tasca1.n2;

public class PhoneES implements Phone {
	
	private String number;
	
	public PhoneES(String number) {
		this.number = "+34 " + number;
	}
	
	@Override
	public String getNumber() {
		return number;
	}
}
