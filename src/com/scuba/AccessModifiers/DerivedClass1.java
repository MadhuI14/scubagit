package com.scuba.AccessModifiers;

public class DerivedClass1 extends Parent{
	DerivedClass1() {
		//System.out.println("private_number: "+private_number);
		System.out.println("default_number: "+default_number);
		System.out.println("protected_number: "+protected_number);
		System.out.println("public_number: "+public_number);
	}
}
