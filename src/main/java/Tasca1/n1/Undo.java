package Tasca1.n1;

import java.util.ArrayList;

public class Undo {
	
	private ArrayList<String> history;
	private static Undo instance;
	
	private Undo() {
		history = new ArrayList<String>();
	}
	
	public static Undo getInstance() {
		if(instance == null) {
			instance = new Undo();
		}
		
		return instance;
	}
	
	
	public void input(String input) {
		history.add(input);
	}
	
	public void remove() {
		history.remove(history.size() -1);
	}
	
	public void history() {
		System.out.println("Historial: ");
		for (String line : history) {
			System.out.println(line);
		}
	}

}
