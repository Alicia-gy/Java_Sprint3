package Tasca2.n2;

public abstract class PaymentMethod extends Payment {
	
	protected double amount;
	
	public double getAmount() {
		return amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}

}
