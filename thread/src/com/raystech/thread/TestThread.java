package com.raystech.thread;

public class TestThread {

	public static void main(String[] args) {
		MultiThreading s1= new MultiThreading("dhoni"); 
		MultiThreading s2= new MultiThreading("vijay");
		s1.start();
		s2.start();
	
	}

}
