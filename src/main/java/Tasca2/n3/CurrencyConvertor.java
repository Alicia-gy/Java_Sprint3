package Tasca2.n3;

public class CurrencyConvertor {
	
	private String currency;
	private double rate;
	
	public CurrencyConvertor(String currency, double rate) {
		this.currency = currency;
		this.rate = rate;
	}
	
	public double convert(double price) {
		return (double) Math.round((price * rate) * 100) / 100;
	}
	
	//getters y setters
	public String getCurrency() {
		return currency;
	}
	
	public double getRate() {
		return rate;
	}
	
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	public void setRate(double rate) {
		this.rate = rate;
	}
}
