package Tasca2.n2;

import java.util.Scanner;

public class Store {
	
	static Scanner scan = new Scanner(System.in);
	
	
	public void pay(double amount) {
		Payment payment = askMethod(amount);
		payment.executeWith(() -> System.out.println("Pago terminado"));
	}
	
	public static PaymentMethod askMethod(double amount) {
		switch(askInt("Introduce el metodo de pago: \n"
				+ "1- Paypal\n"
				+ "2- Cuenta bancaria\n"
				+ "3- Tarjeta de credito\n")) {
			case 1:
				return askPaypal(amount);
			case 2:
				return askBank(amount);
			case 3:
				return askCard(amount);
			default:
				System.out.println("input incorrecto");
				return null;	
		}	
	}
	
	
	public static PaymentPaypal askPaypal(double amount) {
		return new PaymentPaypal(askStringBuffer("Introduce tu email o nombre de usuario de Paypal"), 
				askString("Introduce tu contraseña"),
				amount);
	}
	
	public static PaymentBank askBank(double amount) {
		return new PaymentBank(askStringBuffer("Introduce tu numero de cuenta"),
				askString("Introduce tu nombre"),
				amount);
	}
	
	public static PaymentCard askCard(double amount) {
		return new PaymentCard(askInt("Introduce tu numero de tarjeta"),
				askStringBuffer("Introduce tu nombre"),
				askInt("introduce tu cvv"),
				amount);
	}
	
	static String askString(String message) {
		System.out.println(message);
		return scan.nextLine();
	}
	
	static String askStringBuffer(String message) {
		System.out.println(message);
		String text = scan.nextLine();
		scan.nextLine();
		return text;
	} //usar si se necesita limpiar el buffer despues de pedir la String
	
	static int askInt(String message) {
		System.out.println(message);
		return scan.nextInt();
	}
	
	static double askDouble(String message) {
		System.out.println(message);
		return scan.nextDouble();
	}
	
	

}
