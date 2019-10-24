package aufgabe.array_erweitert;

import java.util.function.UnaryOperator;

public class MyOperator<T> implements UnaryOperator<T> {
	
	T number;

	@Override
	public T apply(T t) {
		return number;
	}

}
