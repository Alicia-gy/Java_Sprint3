package Tasca2.n1;

import java.util.ArrayList;
import java.util.List;

public class Agent {
	
	private List<Agencia> agencias = new ArrayList<>();
	
	public void addAgencia(Agencia agencia) {
		agencias.add(agencia);
	}
	
	public void removeAgencia(Agencia agencia) {
		agencias.remove(agencia);
	}
	
	public void borsaUp() {
		agencias.forEach(agencia -> agencia.notifyUp());
	}
	
	public void borsaDown() {
		agencias.forEach(agencia -> agencia.notifyDown());
	}
	
	
	
}