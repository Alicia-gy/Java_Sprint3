package Tasca2.n3;

public class Main {
	
	public static void main(String[] args) {
		
		PriceViewer pw1 = new PriceViewer(new Item("Patatas", 3.20), new CurrencyConvertor("USD", 1.10));
		PriceViewer pw2 = new PriceViewer(new Item("PC", 1000), new CurrencyConvertor("GBP", 0.86));
		pw1.showConvertedPrice();
		pw2.showConvertedPrice();
		
	}	

}
