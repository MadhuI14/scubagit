package com.scuba.AccessModifiers1;

import com.scuba.AccessModifiers.Parent;

public class IndependentClass2 {
	Parent p = Parent();
	IndependentClass2() {
		//System.out.println("private_number: "+private_number);
				//System.out.println("default_number: "+default_number);
				System.out.println("protected_number: "+protected_number);
				System.out.println("public_number: "+public_number);
	}
	
}
