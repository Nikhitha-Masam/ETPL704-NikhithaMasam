package com.evergent.corejava.strings.immutable;

public final class PersonImmutable { //make class as final

	private final String name; //make attributes as private and final
	private final int age;
	public PersonImmutable(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String myName() {
		return name;
	}
	public int myAge() {
		return age;
	}

}
