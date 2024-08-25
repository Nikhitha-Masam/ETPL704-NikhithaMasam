package com.evergent.com.corejava.objectclassmethods;

public class ImmutableString {
	private final String value;
	public ImmutableString(String value) {
		this.value=value;
	}
	public String myValue() {
		return value;
	}
	public String toString() {
		return value;
	}
}
