package com.raystech.thread;

public class MultiThreading implements Runnable {
	 
String name = null;
	
	  		public MultiThreading () {}
			public MultiThreading (String threadName) {
			this.name= threadName;
}
		public void run() {
				for (int i = 0; i <=5; i++) {
				
				try {
					Thread.sleep(2000);
					System.out.println(name);
					
				} catch (Exception e) {
					
				}
		}
}

}


