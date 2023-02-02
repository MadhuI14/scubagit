package com.scuba.AccessModifiers;

public class Parent {
	private int private_number = 100;
	int default_number = 200;
	protected int protected_number = 300;
	public int public_number = 400;
	
	Parent() {
				System.out.println("private_number: "+private_number);
				System.out.println("default_number: "+default_number);
				System.out.println("protected_number: "+protected_number);
				System.out.println("public_number: "+public_number);
	}
}
