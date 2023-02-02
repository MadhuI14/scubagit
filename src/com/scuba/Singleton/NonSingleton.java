package com.scuba.Singleton;

class Normal {
	public void method1() {
		System.out.println("Normal: instance method1()");
	}
	public void method2() {
		System.out.println("Normal: instance method2()");
	}
}

public class NonSingleton {

	public static void main(String[] args) {
		Normal normal1=new Normal();
		normal1.method1();
		normal1.method2();
		

	}

}
