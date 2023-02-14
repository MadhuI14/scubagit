package com.scuba.Singleton;

class Sample {
	private Sample() {
		System.out.println("private");
		System.out.println("**************Print**************");
	}
	public static Sample obj = null;
	public static Sample getInstance() {
		if(obj==null) {
			obj = new Sample();
		}
		return obj;
	}
	
	public void A() {
		System.out.println("Sample: method A()");
	}
	
	public void B() {
		System.out.println("Sample: method B()");
	}
	
}
public class Singleton {

	public static void main(String[] args) {
		Sample s1 = Sample.getInstance();
		s1.A();
		s1.B();
		System.out.println("****************************");
		Sample s2 = Sample.getInstance();
		s2.A();
		s2.B();
		System.out.println("****************************");
		Sample s3 = Sample.getInstance();
		s3.A();
		s3.B();
	}

}
