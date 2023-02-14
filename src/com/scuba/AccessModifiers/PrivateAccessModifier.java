package com.scuba.AccessModifiers;

class A {  
	private int data=40; 
	
	private A(){}
	
	private void msg(){
		System.out.println("Hello java");
		}  
}  

public class PrivateAccessModifier {

	public static void main(String[] args) {
		A obj=new A();  
		System.out.println(obj.data);//Compile Time Error  
		obj.msg();//Compile Time Error 

	}

}
