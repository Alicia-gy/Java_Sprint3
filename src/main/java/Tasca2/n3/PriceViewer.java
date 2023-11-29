package Tasca2.n3;

public class PriceViewer {
	
	private Item item;
	private CurrencyConvertor convertor;
	
	public PriceViewer(Item item, CurrencyConvertor convertor) {
		this.item = item;
		this.convertor = convertor;
	}
	
	
	public void showConvertedPrice() {
		System.out.println("Articulo: " + item.getName() +
				"\nPrecio: " + convertor.convert(item.getPrice()) + " " + convertor.getCurrency());
	}
	
	//getters y setters
	public Item getItem() {
		return item;
	}
	
	public CurrencyConvertor getConvertor() {
		return convertor;
	}
	
	public void setItem(Item item) {
		this.item = item;
	}
	
	public void setConvertor(CurrencyConvertor convertor) {
		this.convertor = convertor;
	}

}
