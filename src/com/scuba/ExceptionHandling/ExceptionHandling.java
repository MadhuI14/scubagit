package com.scuba.ExceptionHandling;

class Parent{    
	  void msg()throws ArithmeticException {  
	    System.out.println("parent method");  
	  }    
	}    

public class ExceptionHandling extends Parent {
	void msg() {  
	    System.out.println("child method");  
	  }    
	    
	  public static void main(String args[]) {    
	   Parent p = new ExceptionHandling();    
	     
	   try {    
	   p.msg();    
	   }  
	   catch (Exception e){}   
	  
	  }      
}
