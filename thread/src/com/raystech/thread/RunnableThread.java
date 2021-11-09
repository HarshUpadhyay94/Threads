package com.raystech.thread;

public class RunnableThread {

	public static void main(String[] args) {
		MultiThreading s1= new MultiThreading("dhoni"); 
		MultiThreading s2= new MultiThreading("vijay");
		
		Thread t= new Thread(s1);
		Thread t1= new Thread(s2);

		t.start();
		t1.start();	
	}
}
