package Tasca1.n2;

public class Main {

	public static void main(String[] args) {
		
	Agenda agenda1 = new Agenda(selectFactory("ES"), "Calle patata", "123456789");
	Agenda agenda2 = new Agenda(selectFactory("UK"), "Calle falsa 123", "572915769");
	
	System.out.println(agenda1.toString());
	System.out.println(agenda2.toString());
		

	}
	
	private static AbstractFactory selectFactory(String type) {
		AbstractFactory factory = null;
		
		if(type == "ES") {
			factory = new FactoryES();
		} else if (type == "UK") {
			factory = new FactoryUK();
		} else {
			System.out.println("Incorrect Type");
		}
		
		return factory;
	}

}
