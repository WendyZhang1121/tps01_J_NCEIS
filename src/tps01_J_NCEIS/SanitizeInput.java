package tps01_J_NCEIS;

import java.util.concurrent.Callable;

public final class SanitizeInput<V> implements Callable<V> { 
	private final V input;
	SanitizeInput(V input) { 
		this.input = input;
	}
	
	@Override public V call() throws Exception { // Sanitize input and return
		return (V) input;
	} 
}
