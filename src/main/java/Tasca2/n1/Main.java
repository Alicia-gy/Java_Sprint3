package Tasca2.n1;

public class Main {
	
	public static void main(String[] args) {
		
		Agent agent = new Agent();
		Agencia agency1 = new Agencia("Agencia1");
		Agencia agency2 = new Agencia("Agencia2");
		
		agent.addAgencia(agency1);
		agent.addAgencia(agency2);
		
		agent.borsaUp();
		agent.borsaDown();
		
	}

}
