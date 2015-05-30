package Exceptions;

import java.lang.RuntimeException;
import Model.Function;

public class FunctionAlreadyDefinedException extends RuntimeException {
	public FunctionAlreadyDefinedException() {
		super("Function already defined");
	}

	public FunctionAlreadyDefinedException(String functionName) {
		super("Function " + functionName + " already defined");
	}

	public FunctionAlreadyDefinedException(Function function) {
		this(function.name);
	}
}