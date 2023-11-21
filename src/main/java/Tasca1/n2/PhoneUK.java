package Tasca1.n2;

public class PhoneUK implements Phone {
	
	private String number;
	
	public PhoneUK(String number) {
		this.number = "+44 " + number;
	}
	
	@Override
	public String getNumber() {
		return number;
	}
}