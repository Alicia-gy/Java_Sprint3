package Tasca1.n1;

public class Main {
	
	public static void main(String[] args) {
		
		Undo history = Undo.getInstance();
		
		history.input("Input 1");
		history.input("Input 2");
		history.input("Input 3");
		
		history.history();
		
		history.remove();
		
		history.history(); //comprobacion de remove
		
		
		Undo patata = Undo.getInstance(); //comprobacion de que no se crea otro objeto distinto
		patata.input("Input 4");
		
		patata.history();
		history.history();
	}

}
