package com.wilutions.com;

/**
 * This class wraps an Object and is used internally for passing parameters.
 */
public class Variant<T> extends ByRef<T> {
	
	public Variant(T obj) {
		super(obj);
	}
	
	public static <T> Object param(T obj) {
		Object ret = Missing.Value;
		if (obj != null && obj != Missing.Value) {
			if (obj instanceof IDispatch) {
				ret = obj;
			}
			else {
				ret = new Variant<T>(obj);
			}
		}
		return ret;
	}
}
