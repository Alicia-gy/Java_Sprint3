package Tasca2.n1;

public class Agencia implements Observer {
	
	private String name;
	
	public Agencia(String name) {
		this.name = name;
	}
	
	
	public void notifyUp() {
		System.out.println("La borsa ha subido");
	}
	
	public void notifyDown() {
		System.out.println("La borsa ha bajado");
	}
	
	public String getName() {
		return name;
	}
	
}
