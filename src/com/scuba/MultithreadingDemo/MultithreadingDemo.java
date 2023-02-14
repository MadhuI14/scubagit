package com.scuba.MultithreadingDemo;

public class MultithreadingDemo extends Thread {
	public void run(){  
		  if(Thread.currentThread().isDaemon()){//checking for daemon thread  
		   System.out.println("daemon thread work");  
		  }  
		  else{  
		  System.out.println("user thread work");  
		 }  
		 }  
		 public static void main(String[] args){  
			 MultithreadingDemo t1=new MultithreadingDemo();//creating thread  
			 MultithreadingDemo t2=new MultithreadingDemo();  
			 MultithreadingDemo t3=new MultithreadingDemo();  
		  
		  t1.setDaemon(true);//now t1 is daemon thread  
		    
		  t1.start();//starting threads  
		  t2.start();  
		  t3.start();  
		 }  
}
