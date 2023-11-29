package Tasca2.n2;

public class PaymentCard extends PaymentMethod {
	
	private int number;
	private String name;
	private int cvv;
	
	public PaymentCard(int number, String name, int cvv, double amount) {
		this.number = number;
		this.name = name;
		this.cvv = cvv;
		this.amount = amount;
	}
	
	@Override
	public void execute() {
		System.out.println("Pago de " + amount + "€ realizandose con tarjeta");
	}
	
	//getters
	public int getNumber() {
		return number;
	}
	
	public String getName() {
		return name;
	}
	
	public int getCvv() {
		return cvv;
	}

}
