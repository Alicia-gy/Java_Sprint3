package Tasca2.n2;

import java.util.Optional;

public abstract class Payment {
	
	final void executeWith(Callback callback) {
		execute();
		Optional.ofNullable(callback).ifPresent(Callback::call);
	}
	
	public abstract void execute();

}
