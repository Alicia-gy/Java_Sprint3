package Tasca2.n2;

public class PaymentPaypal extends PaymentMethod {
	
	private String mail;
	private String password;
	
	public PaymentPaypal(String mail, String password, double amount) {
		this.mail = mail;
		this.password = password;
		this.amount = amount;
	}
	
	@Override
	public void execute() {
		System.out.println("Pago de " + amount + "€ realizandose con Paypal");
	}
	
	//getters
		public String getMail() {
			return mail;
		}
		
		public String getPassword() {
			return password;
		}
		

}
