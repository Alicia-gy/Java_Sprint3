package Tasca2.n2;

public class PaymentBank extends PaymentMethod {
	
	private String number;
	private String name;
	
	public PaymentBank(String number, String name, double amount) {
		this.number = number;
		this.name = name;
		this.amount = amount;
	}
	
	@Override
	public void execute() {
		System.out.println("Pago de " + amount + "€ realizandose con cuenta bancaria");
	}
	
	//getters
		public String getNumber() {
			return number;
		}
		
		public String getName() {
			return name;
		}
		

}
